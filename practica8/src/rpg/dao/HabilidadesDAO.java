package rpg.dao;

import rpg.model.Habilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HabilidadesDAO {
    private List<Habilidades> listaHabilidades;

    public HabilidadesDAO() {
        this.listaHabilidades = new ArrayList<>();
        cargarHabilidades();
    }

    public void cargarHabilidades() {
        String sql = "SELECT * FROM HABILIDADES";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                // Ajusta los nombres de las columnas según tu DB (ej: id_habilidad, nombre, daño)
                Habilidades hab = new Habilidades(
                        rs.getInt("id_habilidades"),
                        rs.getString("nombre"),
                        rs.getInt("daño_base"),
                        rs.getInt("usos_maximos"),
                        rs.getInt("id_clase"));
                listaHabilidades.add(hab);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al cargar habilidades: " + e.getMessage());
        }
    }

    public Habilidades buscarPorId(int idHabilidad) {
        for (Habilidades habilidad : listaHabilidades) {
            if (idHabilidad == habilidad.get) {
                return habilidad;
            }
        }
        return null;
    }

    public List<Habilidades> getListaHabilidades() {
        return listaHabilidades;
    }


}
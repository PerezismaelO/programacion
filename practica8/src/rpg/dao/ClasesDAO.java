package rpg.dao;
import rpg.model.ClasesRPG;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClasesDAO {
    private List<ClasesRPG> listaClases;

    public ClasesDAO() {
        this.listaClases = new ArrayList<>();
        cargarClases();
    }

    public void cargarClases() {
        String sql = "SELECT * FROM CLASES";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ClasesRPG clase = new ClasesRPG(
                        rs.getInt("id_clase"),
                        rs.getString("nombre_clase")
                );
                listaClases.add(clase);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ClasesRPG buscarPorId(int idClase) {
        for (ClasesRPG clase : listaClases) {
            if (idClase == clase.getId_ClaseRPG()) return clase;
        }
        return null;
    }
}
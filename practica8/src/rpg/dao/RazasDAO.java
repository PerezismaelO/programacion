package rpg.dao;

import rpg.model.Razas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RazasDAO {
    private List<Razas> listaRazas;

    public RazasDAO() {
        this.listaRazas = new ArrayList<>();
        cargarRazas();
    }

    public void cargarRazas() {
        String sql = "SELECT * FROM RAZAS";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Razas raza = new Razas(
                        rs.getString("nombre"),
                        rs.getInt("bonificador_vida"),
                        rs.getInt("bonificador_fuerza"),
                        rs.getInt("id_raza")
                );
                listaRazas.add(raza);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Razas buscarPorId(int idRaza) {
        for (Razas raza : listaRazas) {
            if (idRaza == raza.getId_raza()) return raza;
        }
        return null;
    }
}
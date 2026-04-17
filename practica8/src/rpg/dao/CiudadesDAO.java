package rpg.dao;

import rpg.model.Ciudades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadesDAO {
    private List<Ciudades> listaCiudades;
    public CiudadesDAO() {
        this.listaCiudades = new ArrayList<>();
        cargarCiudades();
    }

    public void cargarCiudades() {
        String sql = "SELECT * FROM CIUDADES";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Ciudades ciud = new Ciudades(
                        rs.getInt("id_ciudad"),
                        rs.getString("nombre_ciudad"),
                        rs.getInt("nivel_minimio_acceso"));
                listaCiudades.add(ciud);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public Ciudades buscarPorId(int idCiudad){
        for (Ciudades ciudad : listaCiudades){
            if (idCiudad == ciudad.getId_Ciudad()) return  ciudad;
        }
        return null;
    }

}


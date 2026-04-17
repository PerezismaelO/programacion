package rpg.dao;
import rpg.model.Ciudades;
import rpg.model.ClasesRPG;
import rpg.model.Personajes;
import rpg.model.Razas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonajesDAO {
    private ArrayList<Personajes> listaPersonajes;

    public PersonajesDAO() {
        this.listaPersonajes = new ArrayList<>();
    }

    public void cargarPersonajes(RazasDAO rDao, ClasesDAO cDao, CiudadesDAO ciDao) {
        String sql = "SELECT * FROM Personajes";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()){
                Ciudades ciudad = ciDao.buscarPorId(resultSet.getInt("id_ciudad"));
                Razas raza = rDao.buscarPorId(resultSet.getInt("id_raza"));
                ClasesRPG clase = cDao.buscarPorId(resultSet.getInt("id_clase"));
                Personajes personajeCargado = new Personajes(
                        clase,
                        ciudad,
                        raza,
                        resultSet.getInt("vida_actual"),
                        resultSet.getInt("oro"),
                        resultSet.getInt("nivel"),
                        resultSet.getString("nombre"),
                        resultSet.getInt("id");
                listaPersonajes.add(personajeCargado);
            }
        } catch (SQLException e) {
            throw new RuntimeException("No se ha añaido el personaje");
        }

    }


}
// 1 y 2 ejercicio es modelo de datos, el 2 es lo hecho en clase, cargar los datos


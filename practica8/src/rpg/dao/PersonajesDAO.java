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
            System.out.println("No se ha añaido el personaje");
        }
    }

    public List<Personajes> getListaPersonajes() {
        return listaPersonajes;
    }

    public void restarOro(int id_personaje, int oro) throws SQLException {
        String SQL = "UPDATE PERSONAJES SET ORO = ORO - ? WHERE ID = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(SQL);
             ps.setInt(1, oro);
             ps.setInt(2, id_personaje);
             ps.executeUpdate();
        } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}



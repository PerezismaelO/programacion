package swrpg.dao;

import swrpg.model.Personaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static swrpg.dao.ConexionDB.getConnection;

public class PersonajeDAO {

    public void registrarPersonaje(Personaje p) {
        String sql = "INSERT INTO PERSONAJES VALUES (?,?,1,500,100,0,?,?,?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getNombre());
            pstmt.setInt(3, p.getIdEspecie());
            pstmt.setInt(4, p.getIdProfesion());
            pstmt.setInt(5, p.getIdPlanetaActual());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("❌ Error al ejecutar la consulta de ejemplo:");
            e.printStackTrace();
        }
    }
}

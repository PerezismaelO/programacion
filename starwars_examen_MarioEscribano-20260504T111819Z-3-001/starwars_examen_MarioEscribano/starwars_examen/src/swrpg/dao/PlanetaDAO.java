package swrpg.dao;

import swrpg.model.Planeta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static swrpg.dao.ConexionDB.getConnection;

public class PlanetaDAO {
    private ArrayList<Planeta> planetas = new ArrayList<>();

    public List<Planeta> listarTodosLosPlanetas() {
        planetas.clear();
        String sql = "SELECT * FROM Planetas";

        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {

            while(rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int nivel_amenaza = rs.getInt("nivel_amenaza");

                Planeta planeta = new Planeta(id, nombre, nivel_amenaza);

                planetas.add(planeta);
            }

            return planetas;
        } catch (SQLException e) {
            System.err.println("❌ Error al ejecutar la consulta de ejemplo:");
            e.printStackTrace();
        }
        return List.of();
    }

    public Planeta obtenerPlanetaMasPeligroso() {
        String sql = "SELECT * FROM PLANETAS ORDER BY nivel_amenaza DESC LIMIT 1";

        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {

            while(rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int nivel_amenaza = rs.getInt("nivel_amenaza");

                Planeta planeta = new Planeta(id, nombre, nivel_amenaza);

                return planeta;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }



}

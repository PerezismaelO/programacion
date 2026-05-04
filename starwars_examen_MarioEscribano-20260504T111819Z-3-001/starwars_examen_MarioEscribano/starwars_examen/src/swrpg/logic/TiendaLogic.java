package swrpg.logic;

import swrpg.exception.CreditosInsuficientesException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static swrpg.dao.ConexionDB.getConnection;

public class TiendaLogic {
    public void comprarEquipamiento(int idPersonaje, int idEquipo) {
        String sql = "SELECT * FROM EQUIPAMIENTO WHERE id = "+idEquipo;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int precio_creditos = rs.getInt("precio_creditos");

                String sql2 = "SELECT * FROM PERSONAJES WHERE id = "+idPersonaje;
                PreparedStatement pstmt2 = conn.prepareStatement(sql2);
                ResultSet rs2 = pstmt2.executeQuery();

                while(rs2.next()) {
                    int creditos = rs2.getInt("creditos");

                    if(creditos >= precio_creditos) {
                        System.out.println("Comprado");

                        creditos = creditos - precio_creditos;

                        String sql3 = "UPDATE PERSONAJES SET creditos = ? WHERE id = "+idPersonaje;
                        PreparedStatement pstmt3 = conn.prepareStatement(sql3);

                        pstmt3.setInt(1, creditos);
                        pstmt3.executeUpdate();

                        String sql4 = "INSERT INTO INVENTARIOS VALUES (?,?,?)";
                        PreparedStatement pstmt4 = conn.prepareStatement(sql4);

                        pstmt4.setInt(1, idPersonaje);
                        pstmt4.setInt(2, idEquipo);
                        pstmt4.setInt(3, 1);
                        pstmt4.executeUpdate();

                    } else {
                        throw new CreditosInsuficientesException("El personaje no tiene creditos suficientes para esta compra");
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al ejecutar la consulta de ejemplo:");
            e.printStackTrace();
        } catch (CreditosInsuficientesException e) {
            System.out.println(e.getMessage());
        }
    }
}

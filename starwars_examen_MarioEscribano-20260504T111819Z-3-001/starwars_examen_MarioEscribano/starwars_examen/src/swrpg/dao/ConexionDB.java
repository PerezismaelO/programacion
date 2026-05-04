package swrpg.dao;
import java.sql.*;

public class ConexionDB {
    public static Connection getConnection() throws SQLException {

        String URL = "jdbc:postgresql://localhost:5432/StarWarsRPG";
        String USER = "republica";
        String PASSWORD = "orden66";

        if (URL.isEmpty()){
            System.out.println("Falta poner la URL");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Metodo de ejemplo
    public static void ejemploConsulta() {
        String sql = "SELECT * FROM Ejemplo";
        
        try (Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {
                
            while (rs.next()) {
                String columna1 = rs.getString("columna1");
                int columna2 = rs.getInt("columna2");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error al ejecutar la consulta de ejemplo:");
            e.printStackTrace();
        }
    }
}

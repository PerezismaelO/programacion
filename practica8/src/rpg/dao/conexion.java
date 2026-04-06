package rpg.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public static void main(String[] args) {
    // Datos
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "xrpg_user";
    String password = "xrpg_password";

    try {
        // Intento conectar la base de datos
        System.out.println("Conectando la base de datos...");
        Connection conectar = DriverManager.getConnection(url, user, password);
        if (conectar != null && !conectar.isClosed()) {
            System.out.println("!CONEXIÓN EXITOSA¡");
            System.out.println("Ya puedes crear consultas");
        }
        conectar.close();
        // Cerramos la conexion para no gastar memoria
    // Catch por si algo falla, atrapa el error y lo muestra
    } catch (SQLException e) {
        System.out.println("ERROR DE CONEXION:");
        System.out.println("Mensaje: " + e.getMessage());
        System.out.println("Estado SQL: " + e.getSQLState());
    }
    }
    }


package rpg.dao;
import java.sql.Connection;

public class PersonajesDAO {
    private Connection conexion;

    public PersonajesDAO(Connection conexion) {
        this.conexion = conexion;
        // Gracias a la conexion nos podemos conectar con PostgreSQL.
        // El DAO no puede hacer nada sin una conexion activa,
        // por eso el constructor la recibe.
        // Le pasamos la conexion que creamos antes.
    }

    // Metodo para leer y para consultar las Razas
}



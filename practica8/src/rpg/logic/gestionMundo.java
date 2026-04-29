package rpg.logic;
import rpg.dao.ItemsDAO;
import rpg.dao.PersonajesDAO;
import rpg.excepciones.FondosInsuficientesException;
import rpg.model.Items;
import rpg.ui.Vista;

import java.sql.SQLException;

public class gestionMundo {
    private PersonajesDAO personajesDAO = new PersonajesDAO();
    private ItemsDAO itemsDAO = new ItemsDAO();
    public void comprarItem(int id_personaje, Items items) throws FondosInsuficientesException {
        int OroActual = personajesDAO.obtenerOro(id_personaje);

        if (OroActual < items.getPrecio_oro()) {
            throw new FondosInsuficientesException("No tienes oro suficiente para comprar " + items.getNombre());
        }
        try {
            personajesDAO.restarOro(id_personaje, items.getPrecio_oro());
            itemsDAO.insertarObjeto(id_personaje, items.getId_item());
            System.out.println("Compra realizada.");
        } catch (SQLException e) {
            System.out.println("Error en la transaccion: " + e.getMessage());
        }

    }

}

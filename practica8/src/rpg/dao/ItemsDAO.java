package rpg.dao;

import rpg.model.Items;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsDAO {
    private List<Items> listaItems;

    public ItemsDAO() {
        this.listaItems = new ArrayList<>();
        cargarItems();
    }

    public void cargarItems() {
        String sql = "SELECT * FROM ITEMS";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Items item = new Items(
                        rs.getInt("id_item"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("precio_oro"),
                        rs.getInt("bonificador_ataque"),
                        rs.getInt("bonificador_defensa")
                );
                listaItems.add(item);
            }
        } catch (SQLException e) {
            System.out.println("No se ha podido cargar el item.");;
        }
    }

    public Items buscarPorId(int idItem) {
        for (Items item : listaItems) {
            if (idItem == item.getId_item()) return item;
        }
        return null;
    }

    public List<Items> getListaItems() {
        return listaItems;
    }
}
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
            throw new RuntimeException(e);
        }
    }

    public Items buscarPorId(int idItem) {
        for (Items item : listaItems) {
            if (idItem == item.getId_item()) return item;
        }
        return null;
    }
}
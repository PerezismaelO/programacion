import java.util.HashMap;

public class Inventario {
    private HashMap<String, Integer> stocks;
    private HashMap<String, Integer> productos_inventario;
    private Producto Producto;
    public Inventario(HashMap<String, Integer> stocks, HashMap<String, Integer> productos_inventario, Producto Producto) {
        this.stocks = new HashMap<>();
        this.productos_inventario = new HashMap<>();
        this.Producto = Producto;
    }
    // Metodos
    public void añadirProducto() {
        productos_inventario.put(Producto.getNombre(), Producto.getPrecio());
    }
    public void añadirStock(int cantidad) {
        stocks.put(Producto.getNombre(), cantidad);
    }



    public HashMap<String, Integer> getProductos_inventario() {
        return productos_inventario;
    }

    public void setProductos_inventario(HashMap<String, Integer> productos_inventario) {
        this.productos_inventario = productos_inventario;
    }

    public HashMap<String, Integer> getStocks() {
        return stocks;
    }

    public void setStocks(HashMap<String, Integer> stocks) {
        this.stocks = stocks;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }
}

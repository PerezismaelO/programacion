import java.util.ArrayList;

public class Producto {
    private ArrayList<Producto> comboFiesta;
    private String nombre;
    private Integer precio;
    private double descuento;

    public Producto(String nombre, Integer precio, double descuento, ArrayList<Producto> comboFiesta, String alérgenos, int tiempo_cocinado, int litros) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.comboFiesta = new ArrayList<>();
    }

    public double calcularPrecioComboFiesta() {

    }

    public ArrayList<Producto> getComboFiesta() {
        return comboFiesta;
    }

    public void setComboFiesta(ArrayList<Producto> comboFiesta) {
        this.comboFiesta = comboFiesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}

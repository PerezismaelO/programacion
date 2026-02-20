import java.util.ArrayList;

public class Bebida extends Producto{
    private int litros;
    public Bebida(String nombre, Integer precio, double descuento, ArrayList<Producto> comboFiesta, String alérgenos, int tiempo_cocinado, int litros) {
        super(nombre, precio, descuento, comboFiesta, alérgenos, tiempo_cocinado, litros);
        this.litros = litros;
    }
}

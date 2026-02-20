import java.util.ArrayList;

public class Comida extends Producto {
    protected String alérgenos;
    protected int tiempo_cocinado;

    public Comida(String nombre, Integer precio, double descuento, ArrayList<Producto> comboFiesta, String alérgenos, int tiempo_cocinado) {
        super(nombre, precio, descuento, comboFiesta, alérgenos, tiempo_cocinado, litros);
        this.alérgenos = alérgenos;
        this.tiempo_cocinado = tiempo_cocinado;
    }

    public int getTiempo_cocinado() {
        return tiempo_cocinado;
    }

    public void setTiempo_cocinado(int tiempo_cocinado) {
        this.tiempo_cocinado = tiempo_cocinado;
    }

    public String getAlérgenos() {
        return alérgenos;
    }

    public void setAlérgenos(String alérgenos) {
        this.alérgenos = alérgenos;
    }
}

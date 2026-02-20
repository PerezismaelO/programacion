import java.util.HashMap;

public class Pedido {
    private HashMap<Integer, Producto> lineas;
    private boolean pedidoCancelado;
    private Integer precio;
    private double descuento;
    private int fecha;

    public Pedido(HashMap<Integer, Producto> lineas, boolean pedidoCancelado, Integer precio, double descuento, int fecha) {
        this.pedidoCancelado = false;
        this.descuento = 0.05;
        this.fecha = fecha;
        this.precio = precio;
    }
    public boolean cancelarPedido() {

        if (!pedidoCancelado) {
            return true;
        }
        return false;
    }

    public HashMap<Integer, Producto> getLineas() {
        return lineas;
    }

    public void setLineas(HashMap<Integer, Producto> lineas) {
        this.lineas = lineas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public boolean isPedidoCancelado() {
        return pedidoCancelado;
    }

    public void setPedidoCancelado(boolean pedidoCancelado) {
        this.pedidoCancelado = pedidoCancelado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}

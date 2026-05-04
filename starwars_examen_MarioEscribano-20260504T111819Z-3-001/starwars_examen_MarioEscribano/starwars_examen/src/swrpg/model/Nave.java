package swrpg.model;

public class Nave {
    private int id;
    private String nombre;
    private String modelo;
    private int integridadCasco;
    private int idPropietario;

    public Nave(int id, String nombre, String modelo, int integridadCasco, int idPropietario) {
        this.id = id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.integridadCasco = integridadCasco;
        this.idPropietario = idPropietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIntegridadCasco() {
        return integridadCasco;
    }

    public void setIntegridadCasco(int integridadCasco) {
        this.integridadCasco = integridadCasco;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }
}

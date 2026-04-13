package rpg.model;

public class Habilidades {
    private int id_habilidades;
    private String nombre;
    private int daño_base;
    private int usos_maximos;
    private int id_clase;

    public Habilidades(int id_habilidades, String nombre, int daño_base, int usos_maximos, int id_clase) {
        this.id_habilidades = id_habilidades;
        this.nombre = nombre;
        this.daño_base = daño_base;
        this.usos_maximos = usos_maximos;
        this.id_clase = id_clase;
    }

    // Getters and setters
    public int getId_habilidades() {return id_habilidades;}

    public void setId_habilidades(int id_habilidades) {this.id_habilidades = id_habilidades;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getDaño_base() {return daño_base;}

    public void setDaño_base(int daño_base) {this.daño_base = daño_base;}

    public int getUsos_maximos() {return usos_maximos;}

    public void setUsos_maximos(int usos_maximos) {this.usos_maximos = usos_maximos;}

    public int getId_clase() {return id_clase;}

    public void setId_clase(int id_clase) {this.id_clase = id_clase;}
}

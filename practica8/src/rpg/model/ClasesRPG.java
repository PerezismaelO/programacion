package rpg.model;

public class ClasesRPG {
    private int id_ClaseRPG;
    private String nombre;

    public ClasesRPG(int id_ClaseRPG, String nombre) {
        this.id_ClaseRPG = id_ClaseRPG;
        this.nombre = nombre;
    }

    public int getId_ClaseRPG() {return id_ClaseRPG;}

    public void setId_ClaseRPG(int id_ClaseRPG) {this.id_ClaseRPG = id_ClaseRPG;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
}

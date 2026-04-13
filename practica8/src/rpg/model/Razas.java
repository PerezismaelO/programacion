package rpg.model;

public class Razas {
    private String nombre;
    private int bonificador_vida;
    private int bonificador_fuerza;
    private int id_raza;

    public Razas(String nombre, int bonificador_fuerza, int bonificador_vida, int id_raza) {
        this.nombre = nombre;
        this.bonificador_fuerza = bonificador_fuerza;
        this.bonificador_vida = bonificador_vida;
        this.id_raza = id_raza;
    }
    // Getters and setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getBonificador_vida() {return bonificador_vida;}

    public void setBonificador_vida(int bonificador_vida) {this.bonificador_vida = bonificador_vida;}

    public int getBonificador_fuerza() {return bonificador_fuerza;}

    public void setBonificador_fuerza(int bonificador_fuerza) {this.bonificador_fuerza = bonificador_fuerza;}

    public int getId_raza() {return id_raza;}

    public void setId_raza(int id_raza) {this.id_raza = id_raza;}
}

package rpg.model;

public class Personajes {
    private String nombre;
    private int nivel;
    private int oro;
    private int vida_actual;
    private int id_raza;
    private int id_clase;
    private int id_ciudad_actual;
    private int id_personaje;

    public Personajes(String nombre, int nivel, int oro, int id_raza, int vida_actual, int id_ciudad_actual, int id_clase, int id_personaje) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.id_raza = id_raza;
        this.vida_actual = vida_actual;
        this.id_ciudad_actual = id_ciudad_actual;
        this.id_clase = id_clase;
        this.id_personaje = id_personaje;
    }

    // Getters and setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getNivel() {return nivel;}

    public void setNivel(int nivel) {this.nivel = nivel;}

    public int getId_raza() {return id_raza;}

    public void setId_raza(int id_raza) {this.id_raza = id_raza;}

    public int getOro() {return oro;}

    public void setOro(int oro) {this.oro = oro;}

    public int getVida_actual() {return vida_actual;}

    public void setVida_actual(int vida_actual) {this.vida_actual = vida_actual;}

    public int getId_clase() {return id_clase;}

    public void setId_clase(int id_clase) {this.id_clase = id_clase;}

    public int getId_ciudad_actual() {return id_ciudad_actual;}

    public void setId_ciudad_actual(int id_ciudad_actual) {this.id_ciudad_actual = id_ciudad_actual;}

    public int getId_personaje() {return id_personaje;}

    public void setId_personaje(int id_personaje) {this.id_personaje = id_personaje;}
}


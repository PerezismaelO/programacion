package rpg.model;

public class Personajes {
    private String nombre;
    private int nivel;
    private int oro;
    private int vida_actual;
    private Razas raza;
    private ClasesRPG clase;
    private Ciudades ciudad;
    private int id_personaje;

    public Personajes(ClasesRPG clase, Ciudades ciudad, Razas raza, int vida_actual, int oro, int nivel, String nombre, int id_personaje) {
        this.clase = clase;
        this.ciudad = ciudad;
        this.raza = raza;
        this.vida_actual = vida_actual;
        this.oro = oro;
        this.nivel = nivel;
        this.nombre = nombre;
        this.id_personaje = id_personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVida_actual() {
        return vida_actual;
    }

    public void setVida_actual(int vida_actual) {
        this.vida_actual = vida_actual;
    }

    public Razas getRaza() {
        return raza;
    }

    public void setRaza(Razas raza) {
        this.raza = raza;
    }

    public ClasesRPG getClase() {
        return clase;
    }

    public void setClase(ClasesRPG clase) {
        this.clase = clase;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

}


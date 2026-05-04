package swrpg.model;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int creditos;
    private int vidaActual;
    private int ladoOscuro;
    private int idEspecie;
    private int idProfesion;
    private int idPlanetaActual;


    public Personaje(int id, String nombre, int nivel, int creditos, int vidaActual, int ladoOscuro, int idEspecie, int idProfesion, int idPlanetaActual) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.creditos = creditos;
        this.vidaActual = vidaActual;
        this.ladoOscuro = ladoOscuro;
        this.idEspecie = idEspecie;
        this.idProfesion = idProfesion;
        this.idPlanetaActual = idPlanetaActual;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getLadoOscuro() {
        return ladoOscuro;
    }

    public void setLadoOscuro(int ladoOscuro) {
        this.ladoOscuro = ladoOscuro;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public int getIdPlanetaActual() {
        return idPlanetaActual;
    }

    public void setIdPlanetaActual(int idPlanetaActual) {
        this.idPlanetaActual = idPlanetaActual;
    }
}

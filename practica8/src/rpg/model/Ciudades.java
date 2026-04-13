package rpg.model;

public class Ciudades {
    private int id_Ciudad;
    private String nombreCiudad;
    private int nivel_minimo_acceso;

    public Ciudades(int id_Ciudad, String nombreCiudad, int nivel_minimo_acceso) {
        this.id_Ciudad = id_Ciudad;
        this.nombreCiudad = nombreCiudad;
        this.nivel_minimo_acceso = nivel_minimo_acceso;
    }

    // Getters and setters
    public int getId_Ciudad() {return id_Ciudad;}

    public void setId_Ciudad(int id_Ciudad) {this.id_Ciudad = id_Ciudad;}

    public String getNombreCiudad() {return nombreCiudad;}

    public void setNombreCiudad(String nombreCiudad) {this.nombreCiudad = nombreCiudad;}

    public int getNivel_minimo_acceso() {return nivel_minimo_acceso;}

    public void setNivel_minimo_acceso(int nivel_minimo_acceso) {this.nivel_minimo_acceso = nivel_minimo_acceso;}
}

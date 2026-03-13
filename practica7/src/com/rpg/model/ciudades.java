package com.rpg.model;

public class ciudades {
    // Atributos
    private String nombre;
    private Integer poblacion;
    private String clima;
    private Integer nivel;


    //  Constructor vacío para que Jackson pueda crear objetos
    public ciudades() {}

    // Constructor
    public ciudades(String nombre, Integer poblacion, String clima, Integer nivel) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.clima = clima;
        this.nivel = nivel;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}

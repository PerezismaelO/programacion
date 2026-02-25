package com.rpg.model;
import java.util.ArrayList;
import java.util.List;

public class personajes {
    // Atributos
    private String nombre;
    private String raza;
    private Integer nivel;
    private List<items> equipo;

    // Constructor
    public personajes(String raza, String nombre, Integer nivel, List<items> equipo) {
        this.raza = raza;
        this.nombre = nombre;
        this.nivel = nivel;
        this.equipo = new ArrayList<>();
    }

    // Getters and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public List<items> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<items> equipo) {
        this.equipo = equipo;
    }
}

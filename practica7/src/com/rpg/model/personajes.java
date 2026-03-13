package com.rpg.model;
import java.util.ArrayList;
import java.util.List;

public class personajes {
    // Atributos
     String nombre;
     String raza;
     Integer nivel;
     List<items> equipo;
     List<String> equipoIds;
     Integer fuerza;
    // Constructor
    public personajes(String raza, String nombre, Integer nivel, List<String> equipoIds, Integer fuerza) {
        this.raza = raza;
        this.nombre = nombre;
        this.nivel = nivel;
        this.equipo = new ArrayList<items>();
        this.equipoIds = new ArrayList<String>();
        this.fuerza = fuerza;
    }

    // Getters and setter
    public String getNombre() { return nombre; }
    public String getRaza() { return raza; }
    public int getNivel() { return nivel; }
    public List<String> getEquipoIds() { return equipoIds; }
    public List<items> getEquipo() { return equipo; }
    public Integer getFuerza() {return fuerza;}

    public void addItem(items i){ equipo.add(i); }



}

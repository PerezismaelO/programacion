package com.rpg.model;
import java.util.ArrayList;
import java.util.List;

public class personajes {
    // Atributos
    private String nombre;
    private String raza;
    private Integer nivel;
    private List<items> equipo;
    private List<String> equipoIds;
    // Constructor
    public personajes(String raza, String nombre, Integer nivel, List<String> equipoIds) {
        this.raza = raza;
        this.nombre = nombre;
        this.nivel = nivel;
        this.equipo = new ArrayList<items>();
        this.equipoIds = new ArrayList<String>();
    }

    // Getters and setter
    public String       getNombre()    { return nombre; }
    public String       getRaza()      { return raza; }
    public int          getNivel()     { return nivel; }
    public List<String> getEquipoIds() { return equipoIds; }
    public List<items>   getEquipo()    { return equipo; }
    public void         addItem(items i){ equipo.add(i); }

}

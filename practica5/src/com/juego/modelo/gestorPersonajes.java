package com.juego.modelo;
import java.util.ArrayList;
import java.util.List;

public class gestorPersonajes {
    private ArrayList<personaje> personajes = new ArrayList<>();
    public ArrayList<personaje> getPersonajes() { return personajes;}

    public void agregarPersonaje(personaje p) {
        personajes.add(p);
    }
}

package com.juego.modelo;
import java.util.ArrayList;
import java.util.List;

public class gestorPersonajes {
    private List<personaje> personajes = new ArrayList<>();
    public List<personaje> getPersonajes() { return personajes;}

    public void agregarPersonaje(personaje p) {
        personajes.add(p);
    }
}

package com.juego.modelo;

import com.juego.clases.*; // Importa Guerrero, Mago, etc.
import com.juego.razas.*;  // Importa Humano, Elfo, etc.
import com.juego.habilidades.habilidad;
import java.util.ArrayList;
import java.util.List;

public class gestorPersonajes {

    private List<personaje> listaPersonajes;

    public gestorPersonajes() {
        this.listaPersonajes = new ArrayList<>();
        cargarPersonajes();
    }

    private void cargarPersonajes() {
        // Ejemplo de creación de personajes iniciales
        // Nota: Asegúrate de que las clases Raza y clase (interfaz) estén implementadas

        // Creamos una lista de habilidades vacía (el presentador las llena luego según tu código)
        List<habilidad> habsVacias = new ArrayList<>();

        // Añadimos personajes a la lista
        // Suponiendo que tienes clases como 'Guerrero' que heredan/implementan 'clase'
        // y 'Humano' que hereda de 'Raza'
        listaPersonajes.add(new personaje("Hagrid", new Humano(), new Guerrero(), new ArrayList<>()));
        listaPersonajes.add(new personaje("Legolas", new Elfo(), new Pícaro(), new ArrayList<>()));
        listaPersonajes.add(new personaje("Gandalf", new Enano(), new Mago(), new ArrayList<>()));
        listaPersonajes.add(new personaje("Silas el Mudo", new Enano(), new Pícaro(), new ArrayList<>()));
        listaPersonajes.add(new personaje("Thalindra", new Humano(), new Druida(), new ArrayList<>()));

    }

    // Este es el metodo que pide tu presentadorCombate
    public List<personaje> getPersonajes() {
        return listaPersonajes;
    }

    // Metodo extra para añadir personajes nuevos si quisieras desde un menú
    public void añadirPersonaje(personaje p) {
        this.listaPersonajes.add(p);
    }
}
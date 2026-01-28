package com.juego;
import com.juego.presentacion.Vista;

import com.juego.presentacion.*;
import com.juego.modelo.*;

public class Main {

    public static void main(String[] args) {

        // Crear la vista (interfaz con el usuario)
        Vista vista = new Vista();

        // Crear el gestor de personajes
        gestorPersonajes gestor = new gestorPersonajes();

        // Crear el presentador (controlador)
        presentadorCombate presentador = new presentadorCombate(vista, gestor);

        // Iniciar el programa
        presentador.iniciar();
    }
}

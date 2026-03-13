package com.rpg.main;
import com.rpg.handler.rpgDataException;
import com.rpg.services.gestionMundo;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        gestionMundo mundo = new gestionMundo();

        try {
            mundo.cargarTodo();
            mundo.guardarCambios();
            mundo.imprimirResumen();

        } catch (rpgDataException e) {
            System.err.println("ERROR FATAL: " + e.getMessage());
        }
    }
}
// equipamiento inteligente modificar crear personaje para que el peso total de los items en equiposids no superen la capacidad de carga de los personajes, carga maxima = fuerza * 5
package com.rpg.main;
import com.rpg.handler.rpgDataException;
import com.rpg.services.gestionMundo;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        gestionMundo mundo = new gestionMundo();

        try {
            // FASE 1: Cargar todos los datos
            System.out.println("Cargando datos...");
            mundo.cargarTodo();
            System.out.println("Datos cargados correctamente.");

            // FASE 3: Crear un nuevo personaje
            mundo.crearPersonaje(
                    "Legolas",          // nombre
                    "Elfo",             // raza
                    15,                 // nivel (prueba con -1 para ver DatoInvalidoException)
                    Arrays.asList("W01") // ítems (prueba con "XXX" para ver RecursoNoEncontradoException)
            );

            // FASE 4: Guardar cambios
            mundo.guardarCambios();

            // Mostrar resumen
            mundo.imprimirResumen();

        } catch (rpgDataException e) {
            System.err.println("ERROR FATAL: " + e.getMessage());
        }
    }
}
// equipamiento inteligente modificar crear personaje para que el peso total de los items en equiposids no superen la capacidad de carga de los personajes, carga maxima = fuerza * 5
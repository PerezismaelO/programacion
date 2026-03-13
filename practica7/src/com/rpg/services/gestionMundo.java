package com.rpg.services;

import com.rpg.handler.*;
import com.rpg.model.*;
import com.rpg.utils.*;
import java.util.*;

public class gestionMundo {

    // Rutas de los ficheros
    private static final String RUTA_ITEMS      = "resources/items.json";
    private static final String RUTA_PERSONAJES = "resources/personajes.json";
    private static final String RUTA_CIUDADES   = "resources/ciudades.txt";

    private final jsonHelper json = new jsonHelper();
    private final txtHelper txt = new txtHelper();
    private final loggerCustom logger = new loggerCustom();

    // Datos en memoria
    private Map<String, items>  mapaItems = new HashMap<String, items>();
    private List<personajes> personajes = new ArrayList<personajes>();
    private List<ciudades> ciudades = new ArrayList<ciudades>();
    private Object idsItems;

    // ── FASE 1: Carga todos los datos ──────────────────────────────────
    public void cargarTodo() throws rpgDataException {

        // 1a. Leer ítems y meterlos en el Map para búsqueda rápida
        List<items> listaItems = json.readList(RUTA_ITEMS, items.class);
        for (items items : listaItems) {
            mapaItems.put(items.getId(), items);
        }

        // 1b. Leer ciudades (TxtHelper ya gestiona errores internamente)
        ciudades = txt.leerCiudades(RUTA_CIUDADES);

        // 1c. Leer personajes y hacer validación cruzada de ítems
        personajes = json.readList(RUTA_PERSONAJES, personajes.class);
        for (personajes p : personajes) {
            for (String idItem : p.getEquipoIds()) {
                items item = mapaItems.get(idItem);  // búsqueda O(1)
                if (item == null) {
                    logger.log("RecursoNoEncontradoException en Personaje '"
                            + p.getNombre() + "': Item '" + idItem + "' no existe.");
                } else {
                    p.addItem(item);
                }
            }
        }
    }

    // ── FASE 3: Crear un nuevo personaje ───────────────────────────────
    public void crearPersonaje(String nombre, String raza, int nivel,
                               List<String> idsItems) throws rpgDataException {
        // Validar nivel
        if (nivel < 0) {
            throw new datoInvalidoException(
                    "DatoInvalidoException en Personaje '" + nombre + "': Nivel " + nivel + " no permitido.");
        }

        // Validar que los ítems existen
        for (String id : idsItems) {
            if (!mapaItems.containsKey(id)) {throw new recursoNoEncontradoException(
                    "RecursoNoEncontradoException: Item '" + id + "' no existe en el catálogo.");
            }
        }

        personajes.add(new personajes(nombre, raza, nivel, idsItems));
        System.out.println("Personaje '" + nombre + "' creado correctamente.");
    }

    // ── FASE 4: Guardar cambios ────────────────────────────────────────
    public void guardarCambios() throws rpgDataException {
        json.writeList(RUTA_PERSONAJES, personajes);
        System.out.println("Cambios guardados en personajes.json");
    }

    // Imprimir resumen final
    public void imprimirResumen() {
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Ciudades cargadas: " + ciudades.size());
        System.out.println("Ítems en catálogo: " + mapaItems.size());
        System.out.println("Personajes totales: " + personajes.size());
        for (personajes p : personajes) {
            System.out.println("  - " + p.getNombre() + " (Nivel " + p.getNivel() + ")");
        }
    }
}


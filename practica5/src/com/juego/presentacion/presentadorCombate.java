package com.juego.presentacion;

import com.juego.modelo.*;
import com.juego.habilidades.*;
import java.util.List;
import java.util.Scanner;

public class presentadorCombate {
    private Vista vista;
    private gestorPersonajes gestor;
    private Scanner sc = new Scanner(System.in);
    private personaje luchador1, luchador2;

    public presentadorCombate(Vista vista, gestorPersonajes gestor) {
        this.vista = vista;
        this.gestor = gestor;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuPrincipal();
            switch (opcion) {
                case 1:
                    if (luchador1 == null || luchador2 == null) {
                        vista.mostrarMensaje("⚠️ Error: Primero elige 2 personajes en la opción 2.");
                    } else {
                        new combate().iniciarCombate(luchador1, luchador2);
                    }
                    break;
                case 2:
                    gestionarPersonajesYHabilidades();
                    break;
            }
        } while (opcion != 3);
    }

    private void gestionarPersonajesYHabilidades() {
        List<personaje> lista = gestor.getPersonajes();

        // 1. Elegir Personajes
        vista.mostrarMensaje("\n--- ELIGE JUGADOR 1 ---");
        for (int i = 0; i < lista.size(); i++) vista.mostrarMensaje((i+1) + ". " + lista.get(i).getNombre());
        luchador1 = lista.get(sc.nextInt() - 1);

        vista.mostrarMensaje("\n--- ELIGE JUGADOR 2 ---");
        luchador2 = lista.get(sc.nextInt() - 1);

        // 2. Añadir Habilidades (Ejemplo automático para que no de error)
        luchador1.getHabilidades().add(new cuerpo_a_cuerpo("Espadazo", 20, 5));
        luchador2.getHabilidades().add(new distancia("Flecha", 15, 8));

        vista.mostrarMensaje("✅ Personajes listos y habilidades equipadas.");
    }
}
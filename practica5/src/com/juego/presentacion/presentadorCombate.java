package com.juego.presentacion;

import com.juego.modelo.*;
import com.juego.habilidades.*;
import java.util.List;
import java.util.Scanner;

public class presentadorCombate {

    private Vista vista;
    // El gestor contiene la lista de personajes disponibles
    private gestorPersonajes gestor;
    private Scanner sc = new Scanner(System.in);
    private personaje jugador1;
    private personaje jugador2;
    // Recibe la vista y el gestor
    public presentadorCombate(Vista vista, gestorPersonajes gestor) {
        this.vista = vista;
        this.gestor = gestor;
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.menuPrincipal();

            if (opcion == 1) {
                iniciarCombate();
            }

            if (opcion == 2) {
                elegirPersonajes();
            }

        } while (opcion != 3);
    }
    // Elegimos los personajes que van a luchar
    private void elegirPersonajes() {
        List<personaje> lista = gestor.getPersonajes();

        System.out.println("\nELIGE JUGADOR 1");
        mostrarLista(lista);
        jugador1 = lista.get(sc.nextInt() - 1);

        System.out.println("\nELIGE JUGADOR 2");
        mostrarLista(lista);
        jugador2 = lista.get(sc.nextInt() - 1);
        // Borramos las habilidades para que no se dupliquen
        jugador1.getHabilidades().clear();
        jugador2.getHabilidades().clear();

        jugador1.getHabilidades().add(new cuerpo_a_cuerpo("Espadazo", 20, 5));
        jugador2.getHabilidades().add(new distancia("Flecha", 15, 8));

        System.out.println("✅ Personajes listos");
    }
    // Muestra los personajes
    private void mostrarLista(List<personaje> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i).getNombre());
        }
    }

    private void iniciarCombate() {
        if (jugador1 == null || jugador2 == null) {
            System.out.println("❌ Primero debes elegir los personajes");
            return;
        }
        // Crea e inicia el combate
        combate combate = new combate();
        combate.iniciarCombate(jugador1, jugador2);
    }
}



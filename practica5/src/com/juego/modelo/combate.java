package com.juego.modelo;

import com.juego.habilidades.habilidad;
import java.util.Scanner;

public class combate {
    private Scanner sc = new Scanner(System.in);
    // Método principal que recibe a los dos luchadores
    public void iniciarCombate(personaje p1, personaje p2) {
        while (p1.estaVivo() && p2.estaVivo()) {
            // Turno Jugador 1
            procesarTurno(p1, p2);
            if (!p2.estaVivo()) break;

            // Turno Jugador 2
            procesarTurno(p2, p1);
        }

        System.out.println("\n=== FIN DEL COMBATE ===");
        System.out.println("Ganador: " + (p1.estaVivo() ? p1.getNombre() : p2.getNombre()));
    }
    // mostramos las habilidades y ejecutamos la elegida
    private void procesarTurno(personaje atacante, personaje defensor) {
        System.out.println("\nTurno de: " + atacante.getNombre() + " (" + atacante.getVida() + " PV)");
        // Recorremos la lista de habilidades del personaje para mostrarlas por pantalla
        for (int i = 0; i < atacante.getHabilidades().size(); i++) {
            System.out.println((i+1) + ". " + atacante.getHabilidades().get(i).getNombre());
        }

        // Leemos la opción del usuario
        System.out.print("Elige ataque: ");
        int sel = sc.nextInt() - 1;
        // Obtenemos la habilidad de la lista según la posición elegida
        habilidad hab = atacante.getHabilidades().get(sel);
        // Ejecutamos la habilidad pasando del atacante al defensor
        hab.usar(atacante, defensor);
    }
}
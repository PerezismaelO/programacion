package com.juego.modelo;

import com.juego.habilidades.habilidad;
import java.util.Scanner;

public class combate {

    // Scanner para leer la opción del usuario en cada turno
    private Scanner sc = new Scanner(System.in);

    // Metodo principal que inicia el combate entre dos personajes
    public void iniciarCombate(personaje p1, personaje p2) {

        // El combate continúa mientras ambos personajes estén vivos
        while (p1.estaVivo() && p2.estaVivo()) {

            // Turno del jugador 1
            procesarTurno(p1, p2);

            // Si el jugador 2 muere, se termina el combate
            if (!p2.estaVivo()) break;

            // Turno del jugador 2
            procesarTurno(p2, p1);
        }

        // Mensajes finales del combate
        System.out.println("\n=== FIN DEL COMBATE ===");

        // Muestra el nombre del personaje que sigue vivo
        if (p1.estaVivo()) {
            System.out.println("Ganador: " + p1.getNombre());
        } else {
            System.out.println("Ganador: " + p2.getNombre());
        }
    }

    // Gestiona un turno completo de un personaje
    private void procesarTurno(personaje atacante, personaje defensor) {

        // Muestra de quién es el turno y su vida actual
        System.out.println(
                "\nTurno de: " + atacante.getNombre() +
                        " (" + atacante.getVida() + " PV)"
        );

        // Muestra todas las habilidades del atacante
        for (int i = 0; i < atacante.getHabilidades().size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                            atacante.getHabilidades().get(i).getNombre()
            );
        }

        // Pide al usuario que elija una habilidad
        System.out.print("Elige ataque: ");
        int seleccion = sc.nextInt() - 1;

        // Obtiene la habilidad elegida de la lista
        habilidad hab = atacante.getHabilidades().get(seleccion);

        // Ejecuta la habilidad usando al atacante contra el defensor
        hab.usar(atacante, defensor);
    }
}

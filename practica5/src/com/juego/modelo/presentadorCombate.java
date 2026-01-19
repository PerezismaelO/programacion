package com.juego.modelo;
import java.util.Scanner;

public class presentadorCombate {
    /*recibe ordenes de la vista y pide datos del gestorPersonajes*/
    private Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("1.Jugar"); // new (combate(P1, P2)), 1 Turno1
        System.out.println("2. Crear personaje");                // P1 VIDA HABILIDADES USOS
        System.out.println("3. Salir");                          // P2 VIDA HABILIDADES USOS
        return sc.nextInt();
    }
}

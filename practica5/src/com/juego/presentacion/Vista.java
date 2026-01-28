package com.juego.presentacion;

import java.util.List;
import java.util.Scanner;
import com.juego.modelo.personaje;

public class Vista {

    private Scanner sc = new Scanner(System.in);

    // Muestra el menú principal y devuelve la opción elegida
    public int menuPrincipal() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Iniciar combate");
        System.out.println("2. Elegir personajes");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    // Muestra cualquier mensaje por pantalla
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Muestra una lista de personajes
    public void mostrarPersonajes(List<personaje> personajes) {
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }
    }

    // Pide un número al usuario
    public int pedirNumero(String texto) {
        System.out.print(texto);
        return sc.nextInt();
    }
}

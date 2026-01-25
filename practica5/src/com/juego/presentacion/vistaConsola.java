package com.juego.presentacion;
import java.util.Scanner;

public class vistaConsola implements Vista {
    // muestra la información y pide datos
    private Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("1. Jugar");
        System.out.println("2. Elegir habilidad");
        System.out.println("3. Salir");

        return sc.nextInt();
    }

    public int pedirOpcion() {
        return sc.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

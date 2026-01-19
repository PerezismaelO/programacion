package com.juego.presentacion;
import com.juego.modelo.personaje;

import java.util.Scanner;

public class vistaConsola implements Vista{
    private Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("1.Jugar"); // new (combate)
        System.out.println("2. Crear personaje");
        System.out.println("3. Salir");
        return sc.nextInt();
    }
    @Override
    public void mostrarEstado(personaje p1, personaje p2) {
        System.out.println(p1.getNombre() + " Puntos de salud: " + p1.getVida());
        System.out.println(p2.getNombre() + " Puntos de salud: " + p2.getVida());
    }
}

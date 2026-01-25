package com.juego.habilidades;

import com.juego.modelo.personaje;

public class distancia implements habilidad {
    private String nombre;
    private int daño;
    private int usos;

    // Constructor que elimina el error "rojo" en el presentador
    public distancia(String nombre, int daño, int usos) {
        this.nombre = nombre;
        this.daño = daño;
        this.usos = usos;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getUsos() { return usos; }

    @Override
    public int getdaño() { return daño; }

    @Override
    public void usar(personaje origen, personaje objetivo) {
        if (usos > 0) {
            System.out.println("🏹 " + origen.getNombre() + " dispara a " + objetivo.getNombre());
            objetivo.recibirDaño(daño); //
            this.usos--;
        } else {
            System.out.println(" No quedan flechas/munición.");
        }
    }
}
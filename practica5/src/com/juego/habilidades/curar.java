package com.juego.habilidades;

import com.juego.modelo.personaje;

public class curar implements habilidad {
    private String nombre;
    private int puntosSalud; // En este caso el daño es positivo para curar
    private int usos;

    public curar(String nombre, int puntosSalud, int usos) {
        this.nombre = nombre;
        this.puntosSalud = puntosSalud;
        this.usos = usos;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getUsos() { return usos; }

    @Override
    public int getdaño() { return puntosSalud; }

    @Override
    public void usar(personaje origen, personaje objetivo) {
        if (usos > 0) {
            System.out.println("💖 " + origen.getNombre() + " usa " + nombre);
            origen.curar(puntosSalud); // Se cura a sí mismo
            this.usos--;
        } else {
            System.out.println("❌ Sin usos de curación.");
        }
    }
}
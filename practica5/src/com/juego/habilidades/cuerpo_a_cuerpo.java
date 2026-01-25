package com.juego.habilidades;

import com.juego.modelo.personaje;

public class cuerpo_a_cuerpo implements habilidad {
    private String nombre;
    private int daño;
    private int usos;

    public cuerpo_a_cuerpo(String nombre, int daño, int usos) {
        this.nombre = nombre;
        this.daño = daño;
        this.usos = usos;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getUsos() { return usos; }

    @Override
    public void usar(personaje origen, personaje objetivo) {
        if (usos > 0) {
            objetivo.recibirDaño(daño);
            usos--;
        }
    }

    @Override
    public int getdaño() { return daño; }
}
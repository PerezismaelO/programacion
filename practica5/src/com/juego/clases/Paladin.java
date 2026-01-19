package com.juego.clases;

import com.juego.habilidades.habilidad;

import java.util.ArrayList;

public class Paladin implements clase{
    // Esta clase guarda los datos
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    // Iniciamos el constructor para inicializar los datos del Paladin
    public Paladin() {
        this.nombre = "Paladin";
        this.bonifFuerza = 2;
        this.bonifInteligencia = 1;
        this.bonifDestreza = 0;
        this.vidaMaxima = 115;
    }
    // Iniciamos los getter para que haya más flexibilidad en los cambios
    public String getNombre() { return nombre;}
    public int getBonifFuerza() { return bonifFuerza;}
    public int getBonifInteligencia() { return bonifInteligencia;}
    public int getBonifDestreza() { return bonifDestreza;}
    public int getVidaMaxima() { return vidaMaxima;}
    @Override
    public ArrayList<habilidad> getHabilidades() { return null;}

}

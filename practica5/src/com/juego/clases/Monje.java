package com.juego.clases;

import com.juego.habilidades.habilidad;

import java.util.ArrayList;

public class Monje implements clase{
    // Esta clase guarda los datos
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    // Iniciamos el constructor para inicializar los datos del Monje
    public Monje() {
        this.nombre = "Monje";
        this.bonifFuerza = 2;
        this.bonifInteligencia = 0;
        this.bonifDestreza = 1;
        this.vidaMaxima = 110;
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

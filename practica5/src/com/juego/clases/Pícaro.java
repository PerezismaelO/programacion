package com.juego.clases;

import com.juego.habilidades.habilidad;

import java.util.ArrayList;

public class Pícaro implements clase{
    // Esta clase guarda los datos
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    // Iniciamos el constructor para inicializar los datos del Pícaro
    public Pícaro() {
        this.nombre = "Pícaro";
        this.bonifFuerza = 0;
        this.bonifInteligencia = 0;
        this.bonifDestreza = 3;
        this.vidaMaxima = 105;
    }
    // Iniciamos los getter para que haya más flexibilidad en los cambios
    public String getNombre() { return nombre;}
    @Override
    public int getBonifFuerza() { return bonifFuerza;}
    @Override
    public int getBonifInteligencia() { return bonifInteligencia;}
    @Override
    public int getBonifDestreza() { return bonifDestreza;}
    @Override
    public int getVidaMaxima() { return vidaMaxima;}
    @Override
    public ArrayList<habilidad> getHabilidades() { return null;}

}

package com.juego.clases;

import com.juego.habilidades.habilidad;

import java.util.ArrayList;

public class Druida implements clase {
    // Esta clase guarda los datos
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    // Iniciamos el constructor para inicializar los datos del Druida
    public Druida() {
            this.nombre = "Druida";
            this.bonifFuerza = 2;
            this.bonifInteligencia = 1;
            this.bonifDestreza = 0;
            this.vidaMaxima = 100;
        }
        // Iniciamos los getter para que haya más flexibilidad en los cambios
        @Override
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
        public ArrayList<habilidad> getHabilidades() {
        return null;
    }


}

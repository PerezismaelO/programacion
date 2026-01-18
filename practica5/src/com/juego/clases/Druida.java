package com.juego.clases;

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
        public String getNombre() { return nombre;}
        public int getBonifFuerza() { return bonifFuerza;}
        public int getBonifInteligencia() { return bonifInteligencia;}
        public int getBonifDestreza() { return bonifDestreza;}
        public int getVidaMaxima() { return vidaMaxima;}

}

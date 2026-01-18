package com.juego.clases;

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
    public int getBonifFuerza() { return bonifFuerza;}
    public int getBonifInteligencia() { return bonifInteligencia;}
    public int getBonifDestreza() { return bonifDestreza;}
    public int getVidaMaxima() { return vidaMaxima;}
}

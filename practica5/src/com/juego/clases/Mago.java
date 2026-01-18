package com.juego.clases;

public class Mago implements clase{
    // Esta clase guarda los datos
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    // Iniciamos el constructor para inicializar los datos del Mago
    public Mago() {
        this.nombre = "Mago";
        this.bonifFuerza = 0;
        this.bonifInteligencia = 3;
        this.bonifDestreza = 0;
        this.vidaMaxima = 90;
    }
    // Iniciamos los getter para que haya más flexibilidad en los cambios
    public String getNombre() { return nombre;}
    public int getBonifFuerza() { return bonifFuerza;}
    public int getBonifInteligencia() { return bonifInteligencia;}
    public int getBonifDestreza() { return bonifDestreza;}
    public int getVidaMaxima() { return vidaMaxima;}
}

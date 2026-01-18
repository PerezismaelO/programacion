package com.juego.clases;

public class Guerrero implements clase{
    // Esta clase guarda los datos
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    // Iniciamos el constructor para inicializar los datos del Guerrero
    public Guerrero() {
        this.nombre = "Guerrero";
        this.bonifFuerza = 3;
        this.bonifInteligencia = 0;
        this.bonifDestreza = 0;
        this.vidaMaxima = 120;
    }
    // Iniciamos los getter para que haya más flexibilidad en los cambios
    public String getNombre() { return nombre;}
    public int getBonifFuerza() { return bonifFuerza;}
    public int getBonifInteligencia() { return bonifInteligencia;}
    public int getBonifDestreza() { return bonifDestreza;}
    public int getVidaMaxima() { return vidaMaxima;}
}

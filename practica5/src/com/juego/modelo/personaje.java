package com.juego.modelo;

public class personaje {
    private int fuerza;
    private int inteligencia;
    private int vidaActual;
    private int vidaMaxima;

    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getVidaActual() { return vidaActual; }
    public int getVidaMaxima() { return vidaMaxima; }

    public void setVidaActual(int vida) { this.vidaActual = vida; }
}

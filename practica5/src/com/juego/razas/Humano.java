package com.juego.razas;

public class Humano implements Raza {
    @Override
    public int getFuerza() { return 5;}
    @Override
    public int getInteligencia() { return 5;}
    @Override
    public int getVidaBase() { return 100;}
    @Override
    public int getDestreza() { return 5;}
    @Override
    public String getNombre() { return "Humano"; }
}

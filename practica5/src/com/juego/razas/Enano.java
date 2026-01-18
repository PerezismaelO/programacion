package com.juego.razas;

public class Enano implements Raza {
    @Override
    public int getFuerza() { return 7;}
    @Override
    public int getInteligencia() { return 4;}
    @Override
    public int getVidaBase() { return 110;}
    @Override
    public int getDestreza() { return 4;}
    @Override
    public String getNombre() { return "Enano"; }
}

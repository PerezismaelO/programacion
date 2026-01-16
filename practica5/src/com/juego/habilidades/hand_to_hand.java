package com.juego.habilidades;

public class hand_to_hand implements habilidad{
    public String nombre;
    public int usos = 5;
    public String bonificador;
    public int dañoBase;

    public hand_to_hand (String nombre, int usos, String bonificador, String typeDamage) {
        this.nombre = nombre;
        this.bonificador = bonificador;
        this.dañoBase = dañoBase;
    }
}

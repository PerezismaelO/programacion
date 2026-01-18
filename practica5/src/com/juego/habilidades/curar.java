package com.juego.habilidades;
import com.juego.modelo.personaje;

public class curar implements habilidad{
    private int usos = 3;

    // Devuelve el nombre de la habilidad
    @Override
    public String getNombre() { return "Curar";}

    // Devuelve el numero de usos restantes de la habilidad
    @Override
    public int getUsos() { return usos;}

    // Aplica el efecto de la habilidad
    @Override
    public void usar(personaje origen, personaje objetivo) {
        if (usos > 0) {
            objetivo.curar(origen.getInteligencia() * 2);
            usos--;
        }
    }
}

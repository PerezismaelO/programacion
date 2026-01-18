package com.juego.habilidades;
import com.juego.modelo.personaje;

public class distancia implements habilidad {
    private int usos = 1;

    @Override
    // Devuelve el nombre de la habilidad
    public String getNombre() { return "Ataque a distancia";}

    @Override
    // Devuelve el numero de usos restantes de la habilidad
    public int getUsos() { return usos;}

    @Override
    // Aplica el efecto de la habilidad
    public void usar(personaje origen, personaje objetivo) {
        if (usos > 0) {
            int daño = origen.getDestreza() * 4;
            objetivo.recibirDaño(daño);
            usos--;
        }
    }
}

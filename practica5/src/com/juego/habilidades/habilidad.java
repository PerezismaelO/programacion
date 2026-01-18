package com.juego.habilidades;
import com.juego.modelo.personaje;

public interface habilidad {


    // Devuelve el nombre de la habilidad
    public String getNombre();


    // Devuelve el numero de usos restantes de la habilidad
    public int getUsos();


    // Aplica el efecto de la habilidad
    public void usar(personaje origen, personaje objetivo); // Quien lanza la habilidad y quien la recibe

}

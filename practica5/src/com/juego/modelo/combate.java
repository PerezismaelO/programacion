package com.juego.modelo;

import com.juego.habilidades.habilidad;

public class combate {
    private personaje jugador1;
    private personaje jugador2;
    private personaje turnoActual;

    public combate(personaje p1, personaje p2) { //Constructor
        this.jugador1 = p1;
        this.jugador2 = p2;
        this.turnoActual = p1; /*El primer turno es del p1, el segundo de p2 y así consecutivamente*/
    }



}

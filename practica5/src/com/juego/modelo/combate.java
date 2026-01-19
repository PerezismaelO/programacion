package com.juego.modelo;

import com.juego.habilidades.habilidad;

public class combate {
    private personaje p1;
    private personaje p2;


    public combate(personaje p1, personaje p2) { //Constructor
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciar() {
        int cont = 0;
        // El bucle no acaba hasta que la vida de un jugador sea 0
        while (this.p1.getVida() > 0 && this.p2.getVida() > 0) {
            System.out.println(" Turno: " + cont);
            System.out.println(p1.mostrarDatos());
            System.out.println(p2.mostrarDatos());
            efectoHabilidad();
            cont++;
            System.out.println();
            System.out.println();
        }
        //¿Quien ha ganado
        if ()
    }

    // efecto habilidad
    // p1 y p2 creados en el main.
    // new combate (p1, p2)
    /* class Combate {
    public Combate(p1, p2)
    this.p1 = p1;
    this.p2 = p2;                                                    this.iniciar()??????
    }
    while {
    Turno 1: mostrar datosPersonaje
    elegirHabilidad
    efectoHabilidad
    ¿Quién ha ganado?
    }
    public void iniciar(){
    cont 0
    while(this.p1.getVida()> 0 && this.p2.getVida() > 0) {
    print(turno + cont)
    print(p1.mostarDatos());
    print(p2.mostrarDatos());
    this.efectoHabilidad(h1, h2);
    cont++;
    }
    if (qn ha ganado)
     */


}

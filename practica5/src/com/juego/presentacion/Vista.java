package com.juego.presentacion;
import com.juego.modelo.personaje;

public interface Vista {
    int menuPrincipal();
    void mostrarEstado(personaje p1, personaje p2);
    /*mostrarMenu() pedirNombre() mostrarEstado()*/
}

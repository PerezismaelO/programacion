package com.juego.clases;
import com.juego.habilidades.habilidad;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface clase {
    // Definimos los metodos en la interfaz
    String getNombre();
    int getBonifFuerza();
    int getBonifInteligencia();
    int getBonifDestreza();
    int getVidaMaxima();
    ArrayList<habilidad> getHabilidades();
}

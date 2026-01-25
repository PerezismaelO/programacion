package com.juego;

import com.juego.modelo.*;
import com.juego.presentacion.*;
import com.juego.razas.*;
import com.juego.clases.*;
import com.juego.habilidades.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vista vista = new vistaConsola();
        gestorPersonajes gestor = new gestorPersonajes();

        // --- PERSONAJE 1: El Bardo Enano ---
        List<habilidad> habsBardo = new ArrayList<>();
        habsBardo.add(new cuerpo_a_cuerpo("Golpe de Laúd", 12, 5));
        habsBardo.add(new distancia("Sonido Discordante", 18, 4));
        habsBardo.add(new curar("Melodía Vital", 15, 2));
        personaje p4 = new personaje("Gimli Cantan1te", new Enano(), new Bardo(), habsBardo);

        // --- PERSONAJE 2: El Sacerdote Elfo ---
        List<habilidad> habsSacerdote = new ArrayList<>();
        habsSacerdote.add(new cuerpo_a_cuerpo("Vara Sagrada", 8, 10));
        habsSacerdote.add(new distancia("Rayo de Luz", 22, 3));
        habsSacerdote.add(new curar("Gran Sanación", 30, 1));
        personaje p5 = new personaje("Elrond Sabio", new Elfo(), new Sacerdote(), habsSacerdote);

        // --- PERSONAJE 3: El Paladín Humano ---
        List<habilidad> habsPaladin = new ArrayList<>();
        habsPaladin.add(new cuerpo_a_cuerpo("Martillo de Justicia", 25, 3));
        habsPaladin.add(new distancia("Sentencia", 15, 5));
        habsPaladin.add(new curar("Imposicion de Manos", 20, 2));
        personaje p6 = new personaje("Uther Protector", new Humano(), new Paladin(), habsPaladin);

        // Los añadimos al gestor (puedes añadir los anteriores también si quieres)
        gestor.agregarPersonaje(p4);
        gestor.agregarPersonaje(p5);
        gestor.agregarPersonaje(p6);

        presentadorCombate presentador = new presentadorCombate(vista, gestor);
        presentador.iniciar();
    }
}

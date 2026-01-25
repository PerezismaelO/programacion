package com.juego.modelo;

import com.juego.clases.clase;
import com.juego.habilidades.habilidad;
import com.juego.razas.Raza;
import java.util.List;

public class personaje {
    // Atributos privados para proteger los datos
    private String nombre;
    private int fuerza, inteligencia, destreza;
    private int vida;
    private List<habilidad> habilidades;

    // Constructor corregido
    public personaje(String nombre, Raza raza, clase clase, List<habilidad> habilidades) {
        this.nombre = nombre;
        // Suma estadísticas de la raza y la clase
        this.fuerza = raza.getFuerza() + clase.getBonifFuerza();
        this.inteligencia = raza.getInteligencia() + clase.getBonifInteligencia();
        this.destreza = raza.getDestreza() + clase.getBonifDestreza();
        this.vida = clase.getVidaMaxima();
        this.habilidades = habilidades;
    }

    // Metodo de daño
    public void recibirDaño(int daño) {
        this.vida -= daño;

        // Si la vida es menor a cero, la deja en 0
        if (this.vida <= 0) {
            this.vida = 0;
        }
        System.out.println(this.nombre + " ha recibido " + daño + " puntos de daño.");
    }

    // Para saber si el personaje esta vivo o no
    public boolean estaVivo() {
        return this.vida > 0;
    }

    // Suma vida al personaje
    public void curar(int cantidad) {
        this.vida += cantidad;
        System.out.println(this.nombre + " se ha curado " + cantidad + " puntos.");
    }

    public String getNombre() { return nombre; }

    public int getVida() { return vida; }

    public List<habilidad> getHabilidades() { return habilidades; }

    public int getFuerza() { return fuerza; }

    public int getInteligencia() { return inteligencia; }

    public int getDestreza() { return destreza; }
}
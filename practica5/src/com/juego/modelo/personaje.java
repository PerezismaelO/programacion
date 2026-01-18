package com.juego.modelo;
import com.juego.clases.clase;
import com.juego.habilidades.habilidad;
import com.juego.razas.Raza;
import java.util.List;

public class personaje {
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vida;
    private List<habilidad> habilidades;

    public personaje(String nombre, Raza raza, clase clase, List<habilidad> habilidades) {
        this.nombre = nombre;
        fuerza = raza.getFuerza() + clase.getBonifFuerza();
        inteligencia = raza.getFuerza() + clase.getBonifInteligencia();
        destreza = raza.getDestreza () + clase.getBonifDestreza();
        vida = clase.getVidaMaxima();
        this.habilidades = habilidades;
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida <= 0) {
            vida = 0;
        }

    }
    public void curar(int cantidad) {
        vida += cantidad;
        }
        public boolean estaVivo() { return vida > 0; }

    public String getNombre() { return nombre;}
    public int getFuerza() { return fuerza;}
    public int getInteligencia() { return inteligencia;}
    public int getDestreza() { return destreza;}
    public int getVida() { return vida;}
    public List<habilidad> getHabilidades() { return habilidades;}
}

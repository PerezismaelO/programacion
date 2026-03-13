package com.rpg.model;

public class items {
    // Atributos
    String id;
    String tipo;
    String nombre;
    Integer valor;
    Integer peso;


    // Constructor
    public items(String id, String tipo, String nombre, Integer valor, Integer peso) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;

    }

    public static void add(items i) {
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getPeso() {return peso;}

    public void setPeso(Integer peso) {this.peso = peso;}
}

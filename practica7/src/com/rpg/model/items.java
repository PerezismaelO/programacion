package com.rpg.model;

public class items {
    // Atributos
    private String id;
    private String tipo;
    private String nombre;
    private Integer valor;
    private

    // Constructor
    public items(String id, String tipo, String nombre, Integer valor) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.valor = valor;
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
}

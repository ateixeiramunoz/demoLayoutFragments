package com.eoi.demoLayoutFragments;


public class Usuario {

    String name;
    String descripcion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario() {
    }

    public Usuario(String name, String descripcion) {
        this.name = name;
        this.descripcion = descripcion;
    }
}

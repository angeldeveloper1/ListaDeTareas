package com.proyecto3;

import java.util.ArrayList;

public class Tareas {

    private String nombre;

    private boolean completada;

    public Tareas(String nombre){
        this.nombre=nombre;
        completada=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        String estado = estaCompletada() ? "[X]" : "[ ]";
        return nombre + " " + estado;
    }
}

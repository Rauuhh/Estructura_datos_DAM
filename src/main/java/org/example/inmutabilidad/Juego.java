package org.example.inmutabilidad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Juego {

    private String nombre;
    private int nivel;
    private List<String> listaPersonajes;

    public Juego(String nombre, int nivel)
    {
        this.nombre = nombre;
        this.nivel = nivel;
        listaPersonajes = new ArrayList<>();
    }

    public List<String> getlista_personajes(){
        return Collections.unmodifiableList(listaPersonajes);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", listaPersonajes=" + listaPersonajes +
                '}';
    }
}

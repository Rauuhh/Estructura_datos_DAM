package org.example.comparadores;

import lombok.Getter;

import javax.annotation.processing.Generated;
import java.util.Objects;
@Getter
public class Producto implements Comparable<Producto>{

    private String nombre;
    private Integer precio;

    public Producto(String nombre, int precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public int compareTo(Producto producto) {

        int devolver = nombre.compareTo(producto.nombre);
        if (devolver != 0)
        {
            return devolver;
        }

        return precio.compareTo(producto.precio);
    }
}

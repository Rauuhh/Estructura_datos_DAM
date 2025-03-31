package org.example.comparadores;

import java.util.Comparator;

public class CompararPorPrecio implements Comparator<Producto> {

    @Override
    public int compare(Producto producto1, Producto producto2) {
    int compararporPrecio = producto1.getPrecio().compareTo(producto2.getPrecio());

    if (compararporPrecio != 0)
    {
        return compararporPrecio;

    }
    return producto1.getPrecio().compareTo(producto2.getPrecio());
    }
}

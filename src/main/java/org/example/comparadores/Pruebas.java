package org.example.comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Pruebas {
    public static void main(String[] args) {
        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(3,2,45,23,5));
        Collections.sort(numeritos);

        System.out.println(numeritos);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patri","Pol","Izan","Andrew"));
        Collections.sort(nombres);

        System.out.println(nombres);

        ArrayList<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("sudadera",6));
        listaProducto.add(new Producto("pan",1));
        listaProducto.add(new Producto("arroz",4));
        listaProducto.add(new Producto("arroz",6));

        Collections.sort(listaProducto,new CompararPorPrecio());
        System.out.println(listaProducto);

    }
}

package org.example;

import java.util.Arrays;

public class Tapas{

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String datos = in.nextLine();
            String[] dato = datos.split(" ");
            int tapa = Integer.parseInt(dato[0]);
            if (dato.length != tapa +1)
            {
                return false;
            }
            int contador = 0;
            int[] valoraciones = new int[tapa];
            for (int i = 1; i <= tapa; i++) {
                valoraciones[contador] = Integer.parseInt(dato[i]);
                contador++;
            }Arrays.sort(valoraciones);
            System.out.print(valoraciones[valoraciones.length -1] + " ");
            System.out.println(valoraciones[0]);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
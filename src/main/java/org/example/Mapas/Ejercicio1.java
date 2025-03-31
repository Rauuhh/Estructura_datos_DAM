package org.example.Mapas;

import java.util.*;

public class Ejercicio1 {
        static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String frase = entrada.nextLine();
        String[] palabra = frase.split(" ");
        Map<String, Integer> mapa = new HashMap<>();
        for (String palabras : palabra)
        {
            mapa.put(palabras,mapa.getOrDefault(palabras,0)+1);
        }
        System.out.println(mapa);

        for (Map.Entry<String, Integer> palabras : mapa.entrySet()){
            System.out.println(palabras.getKey() + ": " + palabras.getValue());
        }
    }

}

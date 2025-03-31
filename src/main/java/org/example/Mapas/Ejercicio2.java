package org.example.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce una palabra");
        String frase = entrada.nextLine();
        Map<Character, Integer> mapa = new HashMap<>();
        for (Character palabras : frase.toCharArray()) {
            mapa.put(palabras, mapa.getOrDefault(palabras, 0) + 1);
        }

        for (Map.Entry<Character, Integer> palabras : mapa.entrySet()) {
            System.out.println(palabras.getKey() + ": " + palabras.getValue());
        }
    }
}

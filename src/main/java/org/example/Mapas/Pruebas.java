package org.example.Mapas;

import java.util.HashMap;

public class Pruebas {
    public static void main(String[] args) {
        HashMap<String,Integer> mapaNotas = new HashMap<>();
        mapaNotas.put("Adrian", 3);
        mapaNotas.put("Raul",4);
        mapaNotas.put("Manuel",7);
        mapaNotas.put("Adrian",4);
        System.out.println("Nota para Raul: " + mapaNotas.get("Raul"));
        System.out.println(mapaNotas.remove("Manuel"));
        System.out.println(mapaNotas.keySet()



        );
    }
}

package org.example.comparadores;

import java.util.*;

public class prieba_mapas {
    public static void main(String[] args) {
        Map<Integer,String> mapita = new HashMap<>();
        mapita.put(12345,"Patricia");
        mapita.put(584993,"Manuel");
        mapita.put(3452,"Raúl");

        List<Map.Entry<Integer,String>> listamapa = new ArrayList<>(mapita.entrySet());
        listamapa.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer,String> mapita2: listamapa){
            System.out.println("dni: " + mapita2.getKey() + " con nombre " + mapita2.getValue());
        }
    }
}

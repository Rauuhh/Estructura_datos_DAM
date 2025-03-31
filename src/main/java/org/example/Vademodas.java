package org.example;

import java.util.HashMap;
import java.util.Map;

public class Vademodas {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {
        int numeros = entrada.nextInt();
        entrada.nextLine();
        if (numeros == 0){
            return false;
        }else {
            Map<String, Integer> mapa = new HashMap<>();
            String frase = entrada.nextLine();
            String[] numero = frase.split(" ");
            for (String num : numero)
            {
                if (mapa.containsKey(num)){
                    mapa.put(num, mapa.get(num)+1);
                }else{
                    mapa.put(num,1);
                }
            }
            Integer max = 0;
            String clave = "0";
            for (Map.Entry<String, Integer> map : mapa.entrySet())
            {
                if (max < map.getValue()){
                    max = map.getValue();
                    clave = map.getKey();
                }
            }
            System.out.println(clave);
        }
        return true;
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
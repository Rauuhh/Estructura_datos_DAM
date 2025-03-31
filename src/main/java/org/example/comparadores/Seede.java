package org.example.comparadores;
import java.util.HashMap;
import java.util.Map;

public class Seede {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {
        int numeros = entrada.nextInt();
        entrada.nextLine();
        if (numeros == 0){
            return false;
        }else {
            Map<String, Integer> mapa = new HashMap<>();
            String frase = entrada.nextLine();
            String[] Candidatura = frase.split(" ");
            if (Candidatura.length != numeros)
            {
                return true;
            }
            for (String num : Candidatura)
            {
                if (mapa.containsKey(num)){
                    mapa.put(num, mapa.get(num)+1);
                }else{
                    mapa.put(num,1);
                }
            }
            Integer max = 0;
            String clave = "0";
            boolean empate = false;
            for (Map.Entry<String, Integer> map : mapa.entrySet())
            {
                if (max < map.getValue()){
                    max = map.getValue();
                    clave = map.getKey();
                    empate = false;
                }
                 else if (max == map.getValue())
                {
                    empate = true;
                }

            }
            if (empate){
                System.out.println("EMPATE");
            }else{
                System.out.println(clave);
            }

        }
        return true;
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}

package org.example.Mapas.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {
    static Scanner entrada = new Scanner(System.in);
    private HashMap<String, Integer> mapaTemperaturas;
    public RegistroTemperaturas(){
        mapaTemperaturas = new HashMap<>();
    }

    public void InterstarTemperatura(String ciudad, Integer temperatura){
        mapaTemperaturas.put(ciudad,temperatura);
    }

    public void ActualizarTemperatura(String ciudad){
        System.out.println("Inserta la temperatura de " + ciudad + ": ");
        mapaTemperaturas.put(ciudad, entrada.nextInt());
    }

    public void ConsultarTemperatura() {
        System.out.println("Introduce la ciudad a consultar");
        String ciudad = entrada.next();
        if (mapaTemperaturas.containsKey(ciudad)) {
            System.out.println("La temperatura en " + ciudad + " es de " + mapaTemperaturas.get(ciudad));
        }else{
            System.out.println("La ciudad " + ciudad + " no tiene temperatura registrada");
        }
    }
    public void mostar(){
        for (Map.Entry<String, Integer> temeperatura : mapaTemperaturas.entrySet())
        {
            System.out.println(temeperatura.getKey() + ": " + temeperatura.getValue() + "º");
        }

    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }



}

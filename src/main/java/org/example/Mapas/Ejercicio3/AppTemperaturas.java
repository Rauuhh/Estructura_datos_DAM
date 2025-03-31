package org.example.Mapas.Ejercicio3;

public class AppTemperaturas {
    public static void main(String[] args) {
        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.InterstarTemperatura("Campello",33);
        System.out.println(registro);
        registro.ActualizarTemperatura("Campello");
        System.out.println(registro);
        registro.ConsultarTemperatura();
        System.out.println(registro);
        registro.mostar();
    }
}

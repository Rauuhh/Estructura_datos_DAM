package org.example.inmutabilidad;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        Juego pokemon = new Juego("Pokemon Plata", 100);

        List<String> litsaPokemon = pokemon.getlista_personajes();
        litsaPokemon.add("Pikachu");
        pokemon.getlista_personajes().add("Squirtle");
        pokemon.getlista_personajes().add("Charmander");
        System.out.println(pokemon.getlista_personajes());
    }
}

package org.example.conjuntosSets;

import java.util.*;

public class Pruebas {
    public static void main(String[] args) {
//        Set<Character> letras = new HashSet<>();
//        letras.add('a');
//        letras.add('e');
//        letras.add('i');
//        letras.add('o');
//        letras.add('u');
//        letras.add('a');
//        System.out.println(letras);
//
//        Set<Character> letras_enlazadas = new LinkedHashSet<>();
//        letras_enlazadas.add('z');
//        letras_enlazadas.add('b');
//        letras_enlazadas.add('g');
//        System.out.println(letras_enlazadas.add('z'));
//        System.out.println(letras_enlazadas);
//        System.out.println("_----------------_");
//        Set<Character> letras_ordenadas = new TreeSet<>();
//        letras_ordenadas.add('v');
//        letras_ordenadas.add('n');
//        letras_ordenadas.add('d');
//        letras_ordenadas.add('p');
//        letras_ordenadas.add('p');
//        System.out.println(letras_ordenadas);

        Scanner entrada = new Scanner(System.in);
//        Set<String> ejercicio1 = new HashSet<>();
//        System.out.println("Escribe una frase");
//        String[] vector = entrada.nextLine().split(" ");
//        for (int i = 0; i < vector.length; i++) {
//            ejercicio1.add(vector[i]);
//        }
//        System.out.println(ejercicio1);

//        Set<String> ejercicio2 = new LinkedHashSet<>();
//        String pagina;
//        boolean condicion = true;
//        int contador =1;
//        do
//        {
//            System.out.print("Escribe una URL visitada (o 'salir' para terminar):");
//            pagina = entrada.next();
//            if (pagina.equals("salir"))
//            {
//                condicion = false;
//            }
//            else{
//                ejercicio2.add(pagina);
//
//            }}while (condicion);
//        System.out.println("Historial de navegacion");
//        for (String lis : ejercicio2)
//        {
//            System.out.println(contador + ". " + lis);
//            contador++;
//        }

        TreeSet<Integer>lista1 = new TreeSet<>();
        TreeSet<Integer>lista2 = new TreeSet<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista2.add(99);
        lista2.add(7);

        TreeSet<Integer>lista3 = new TreeSet<>();
        while (!lista1.isEmpty() || !lista2.isEmpty())
            {
                if (!lista1.isEmpty()){
                    lista3.add(lista1.pollFirst());
                }else {
                    lista3.add(lista2.pollFirst());
                }

            }
        System.out.println(lista3);

    }
}

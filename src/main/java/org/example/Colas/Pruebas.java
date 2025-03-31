package org.example.Colas;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Pruebas {
    public static void main(String[] args) {
//        Queue<Integer> numeros = new ArrayBlockingQueue<>(2);
//        numeros.add(3);
//        numeros.add(4);
//        Queue<Integer> numero2 = new LinkedList<>();
//        numero2.add(34);
//        numero2.add(15);
//        numero2.add(56);
//
//        System.out.println(numero2.poll());
//        System.out.println(numero2.peek());

//        Deque<Integer> cola_doble = new LinkedList<>();
//        cola_doble.offer(3);
//        cola_doble.offerFirst(6);

       /* Queue<Character> cola = new LinkedList<>();
        cola.offer('a');
        cola.offer('e');
        cola.offer('i');
        cola.offer('o');
        cola.offer('u');
        if (cola.isEmpty())
        {
            System.out.println("Cola vacia");
        }else{
            System.out.println("La cola tiene datos");
        }
        System.out.println(cola.size());
        System.out.println(cola.peek());
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }*/

       /* Queue<String> trabajos = new LinkedList<>();
        trabajos.offer("Imprimir documento 1");
        trabajos.offer("Imprimir documento 2");
        trabajos.offer("Imprimir documento 3");
        trabajos.offer("Imprimir documento 4");
        trabajos.offer("Imprimir documento 5");
        System.out.print("Estado inicial de la cola de impresion:");
        System.out.println(trabajos);
        System.out.println();
        while (!trabajos.isEmpty())
        {
            System.out.println("Procesando: " + trabajos.peek());
            trabajos.poll();
            System.out.print("Estado de la cola despues de procesar el trabajo: ");
            System.out.println(trabajos);
        }
        System.out.println("No hay mas trabajos en la cola de impresion");*/

//        Queue<String> playlist = new LinkedList<>();
//        playlist.offer("Let it be - The beatles");
//        playlist.offer("Bohemian rhapsody - Queen");
//        playlist.offer("Shape of you - Ed Sheeran");
//        playlist.offer("Blinding Lights - The weekend");
//        playlist.offer("Stay - Justin bieber");
//
//        System.out.print("Estado inicial de la playlist: ");
//        System.out.println(playlist);
//        while (!playlist.isEmpty())
//        {
//            System.out.println("Reproduciendo: " + playlist.peek());
//            playlist.poll();
//            System.out.println("Estado de la playlist despues de reproducir la canción: " + playlist);
//        }
//        System.out.println("La playlist ha terminado");


        Deque<Character> palindromo = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String palabra = entrada.next();
        for (int i = 0; i < palabra.length(); i++) {
            palindromo.offer(palabra.charAt(i));
        }
//        boolean variable = true;
//        while (!palindromo.isEmpty() && palindromo.size() !=1)
//        {
//            if (palindromo.peekFirst()
//
//                    != palindromo.peekLast()){
//                variable = false;
//            }
//            palindromo.pollFirst();
//            palindromo.pollLast();
//        }
//        if (variable)
//        {
//            System.out.println("Es palindroma");
//        }else
//        {
//            System.out.println("No es palindroma");
//        }

            Deque<String> lista = new LinkedList<>();
        lista.offer("hola");
        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");

        System.out.println("Seleccione una opcion");
        String opcion = entrada.next();

        System.out.println("---------------------------");

        switch (opcion){
            case "1":
                System.out.println("Producto a añadir");
                String producto = entrada.next();
                lista.offerLast(producto);
            break;
            case "2":
                lista.pollFirst();
                break;
            case "3":
                System.out.println("Producto a eliminar");
                String producto2 = entrada.next();
                for (String pro : lista)
                {
                    if (pro.equals(producto2))
                    {
                        lista.poll();
                    }
                }
                break;
            case "4":
                System.out.println(lista.peek());
                break;
            case "5":
        }




    }
}

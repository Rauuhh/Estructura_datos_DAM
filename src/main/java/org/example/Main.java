package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> pila = new Stack<>();
//        pila.push(5);
//        pila.push(10);
//        pila.push(34);
//        pila.push(2);
//
//        System.out.println(pila.peek());
//        System.out.println();
//        for (Integer nums : pila)
//        {
//            System.out.println(nums);
//        }
//        System.out.println();
//        pila.pop();
//        System.out.println(pila.peek());
//        while (!pila.isEmpty());
//        {
//            System.out.println(pila.pop());
//        }

//        Stack<Character> letras = new Stack<>();
//        letras.push('a');
//        letras.push('e');
//        letras.push('i');
//        letras.push('o');
//        letras.push('u');
//        System.out.println(letras.isEmpty());
//        System.out.println(letras.size());
//        System.out.println(letras.peek());
//        while (!letras.isEmpty())
//        {
//            System.out.println(letras.pop());
//        }
            Scanner entrada = new Scanner(System.in);
//
//        Stack<Integer> numeros = new Stack<>();
//        System.out.println("Introduce el primer numero");
//        numeros.push(entrada.nextInt());
//        System.out.println("Introduce el segundo numero");
//        numeros.push(entrada.nextInt());
//        System.out.println("Introduce el tercer numero");
//        numeros.push(entrada.nextInt());
//        System.out.println("Numeros inversos");
//
//        while(!numeros.isEmpty())
//        {
//            System.out.println(numeros.pop());
//        }


        System.out.println("Introduce una expresion matematica");
        String expresion = entrada.next();
        esBalanceado(expresion);
        if (esBalanceado(expresion)){
            System.out.println("Los parentesis estan bien cerrao");
        }else{
            System.out.println("Los parentesis estan mal cerraos");
        }
    }

    private static boolean esBalanceado(String expresion)
    {
        Stack<String> ex = new Stack<>();
        String[] expresiom = expresion.split("");
        for (int i = 0; i < expresion.length(); i++) {
            if (expresiom[i].equals("("))
            {
                ex.push(expresiom[i]);
            } else if (expresiom[i].equals(")") && ex.contains("(")) {
                ex.pop();
            }
        }
        if (ex.isEmpty()) {
        return true;
        }
        return false;
    }
}
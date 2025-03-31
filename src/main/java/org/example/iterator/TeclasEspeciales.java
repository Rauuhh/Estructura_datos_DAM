package org.example.iterator;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class TeclasEspeciales {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe un texto...");
        String linea = entrada.nextLine();
        LinkedList<Character> texto = new LinkedList<>();
        ListIterator<Character> it = texto.listIterator();
        for (char c : linea.toCharArray())
        {
            switch (c){
                case '<':
                    if (it.hasPrevious())
                    {
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext())
                    {
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious())
                    {
                    it.previous();
                    it.remove();
                    }

                    break;
                default:
                    it.add(c);
                    break;
            }
        }

        for(char c : texto)
        {
            System.out.print(c);
        }
    }
}

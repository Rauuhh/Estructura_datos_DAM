package org.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_listiterator {
    public static void main(String[] args) {
        ArrayList<Character> letritas = new ArrayList<>(Arrays.asList('a','b','c','d','e'));
        ListIterator<Character> iterator = letritas.listIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
            iterator.set('r');
        }
        System.out.println(




        );
        ListIterator<Character> iterator_patras = letritas.listIterator(letritas.size());
        while (iterator.hasPrevious())
        {
            System.out.print(iterator.previous() + " ");
        }

    }
}

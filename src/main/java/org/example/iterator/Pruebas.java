package org.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Pruebas {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10,23,45,1,3,5));

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){
            Integer num = it.next();
            System.out.println(num);

            if (num == 23){
                it.remove();
            }
        }


    }
}

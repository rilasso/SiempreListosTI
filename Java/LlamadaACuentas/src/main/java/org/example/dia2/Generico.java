package org.example.dia2;

import java.util.*;

public class Generico {
    public static <T> void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        stringList.add("Hello World!");
        stringList.add("Ricardo");
        stringList.add("Lasso de la Vega");
        stringList.add("Codigo");

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        List<T> listaCompleta = new ArrayList<>();
        listaCompleta.add((T) stringList.get(0));
        listaCompleta.add((T) stringList.get(1));
        listaCompleta.add((T) stringList.get(2));
        listaCompleta.add((T) stringList.get(3));
        listaCompleta.add((T) intList.get(0));
        listaCompleta.add((T) intList.get(1));
        listaCompleta.add((T) intList.get(2));
        listaCompleta.add((T) intList.get(3));

        for (T valor:listaCompleta) {
            System.out.println(valor);

        }
    }

}

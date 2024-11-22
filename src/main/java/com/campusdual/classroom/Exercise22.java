package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> list = new ArrayList<>();
        pruebaLista(list);
        return list;
    }

    private static void pruebaLista(List<String> customList) {
        customList.add("GKFFD");
        customList.add("TNANA");
        customList.add("MPMSL");
        customList.add("PSWME");
        customList.add("LZMLF");
        customList.add("JYEBV");
        customList.add("YELNT");
        customList.add("JSNKR");
        customList.add("JFESF");
        customList.add("TMJLL");
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String element : customList ) {
            System.out.println(element);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> lista = createArrayList();

        System.out.println("Lista de elementos: ");
        printElementsAndIndex(lista);

        addElementToList(lista, "AAAAA");

        System.out.println("\nLista con el nuevo elemento: ");
        printElementsAndIndex(lista);
    }


}

package com.mycompany.aprendiendojavagit;

import java.util.*;

public class colecciones {
    public static void main(String[] args) {
        List<String> listaPersonas = new ArrayList<String>();  //esto es arraylist
        listaPersonas.add("Lionel Messi");
        listaPersonas.add("Cristiano Ronaldo");
        for (String person:listaPersonas){
            System.out.println("Hola: "+person);
        }
        List<String> listaPersonas2 = new LinkedList<String>(); //esto es Linkedlist
        listaPersonas2.add("Lionel Messi");
        listaPersonas2.add(0,"Cristiano Ronaldo");
        for (String personas:listaPersonas2){
            System.out.println("Hola!: "+personas);
        }
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        String valor = mapa.get(2); //traemos el valor asociado a la key 2
        System.out.println(valor); //mostramos por pantalla el valor asociado a la key
        mapa.remove(2); //eliminamos el elemento con la key 2
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            Integer clave = entrada.getKey();
            String valor2 = entrada.getValue();
            System.out.println ("La clave es: " + clave + " El valor es: " + valor2);
        }
    }

}

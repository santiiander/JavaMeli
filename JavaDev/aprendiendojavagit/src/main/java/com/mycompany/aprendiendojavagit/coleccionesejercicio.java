package com.mycompany.aprendiendojavagit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class coleccionesejercicio {
    public static void main(String[] args) {
        //necesito crear 3 objetos siendo las categorias con sus cualidades
        Map<Integer,String>CircuitoChico=new HashMap<>();
        CircuitoChico.put(2,"Selva y Arroyos");

        Map<Integer,String>CircuitoMedio=new HashMap<>();
        CircuitoMedio.put(5,"Selva, Arroyos Y Barro");

        Map<Integer,String>CircuitoAvanzado=new HashMap<>();
        CircuitoAvanzado.put(10,"Selva, Arroyos, Barro y Escalada de Pierda");

        for (Map.Entry<Integer, String> entrada : CircuitoChico.entrySet()) {
            Integer clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println ("La distancia es: " + clave +"km" + " El circuito es: "  + valor);
        }
        for (Map.Entry<Integer, String> entrada : CircuitoMedio.entrySet()) {
            Integer clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println ("La distancia es: " + clave +"km" + " El circuito es: "  + valor);
        }
        for (Map.Entry<Integer, String> entrada : CircuitoAvanzado.entrySet()) {
            Integer clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println ("La distancia es: " + clave +"km" + " El circuito es: "  + valor);
        }
    }
}

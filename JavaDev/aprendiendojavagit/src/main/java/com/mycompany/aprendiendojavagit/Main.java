package com.mycompany.aprendiendojavagit;

public class Main {
    public static void main(String[] args) {
        Libro libro= new Libro("Fnaf ","Scott Cawton ",20);
        System.out.println(libro.mostrarlibro());
        System.out.println("La cantidad de ejemplares de este libro son "+libro.cantidad);

    }

}

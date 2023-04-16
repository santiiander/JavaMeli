package com.mycompany.aprendiendojavagit;

public class dowhile {
    public static void main(String[] args) {
        String saludo= "Hola Santiago!";
        int contador=0;

        do {
            System.out.println(saludo+" saludo numero: "+(contador));
            contador++;
        } while (contador<11);

    }
}

package com.mycompany.aprendiendojavagit;

import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos al vector");
        int numeros[]=new int[6];
            for(int i=0;i<numeros.length;i++){
                numeros[i]=scanner.nextInt();
            }
        for(int i=0;i<numeros.length;i++){
            System.out.println("Estoy en el indice: "+i);
            System.out.println("Tengo guardado un: "+numeros[i]);

        }
    }
}

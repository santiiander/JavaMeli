package com.mycompany.aprendiendojavagit;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posición: " + i + j);
                matriz[i][j] = scanner.nextInt();

            }
        }
        System.out.println("Aquí está la matriz");
        for (int i = 0; i < 3; i++) {
            System.out.println("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);


            }
        }
    }
}
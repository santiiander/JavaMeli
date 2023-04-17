package com.mycompany.aprendiendojavagit;

import java.util.Scanner;

public class ejerciciomatriz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] ciudades =new String[10];
        int[][] temperaturas =new int[10][2];
        int maxTemp = temperaturas[0][0];
        int minTemp = temperaturas[0][0];
        int maxTempI = 0;
        int maxTempJ = 0;
        int minTempI = 0;
        int minTempJ = 0;

        for(int i=0 ; i<10 ; i++ ){
            System.out.println("Agregue el nombre la ciudad: "+i);
            ciudades[i]=scanner.nextLine();
        }
        for(int i=0;i<10;i++){
            for (int j=0;j<2;j++){
                System.out.println("Agregue las temperaturas por favor, de minima a maxima correspondiente a la ciudad: "+ciudades[i]);
                temperaturas[i][j]= scanner.nextInt();
            }
            scanner.nextLine(); // Consumir el carácter de salto de línea
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (temperaturas[i][j] > maxTemp) {
                    maxTemp = temperaturas[i][j];
                    maxTempI = i;
                    maxTempJ = j;
                }
                if (temperaturas[i][j] < minTemp) {
                    minTemp = temperaturas[i][j];
                    minTempI = i;
                    minTempJ = j;
                }
            }
        }

        System.out.println("La temperatura máxima es " + maxTemp + " en la ciudad " + ciudades[maxTempI] + ", posición [" + maxTempI + "][" + maxTempJ + "]");
        System.out.println("La temperatura mínima es " + minTemp + " en la ciudad " + ciudades[minTempI] + ", posición [" + minTempI + "][" + minTempJ + "]");



    }

    }



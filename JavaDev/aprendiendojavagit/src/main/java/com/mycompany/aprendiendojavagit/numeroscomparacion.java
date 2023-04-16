package com.mycompany.aprendiendojavagit;

import javax.swing.*;

public class numeroscomparacion {

    public static void main(String [] args){

        int num1,num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));

        if (num1<num2){
            JOptionPane.showMessageDialog(null,"EL primer numero ingresado es menor que el segundo");
        } else if (num1>num2) {
            JOptionPane.showMessageDialog(null,"EL primer numero ingresado es mayor que el segundo");
        }
        else {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");

        }
    }
}

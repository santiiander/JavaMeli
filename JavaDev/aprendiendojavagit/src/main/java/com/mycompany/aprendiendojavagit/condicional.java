package com.mycompany.aprendiendojavagit;

import javax.swing.JOptionPane;

public class condicional {
    public static void main(String[] args){

        int numero,dato=5;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        if (numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es distinto de 5");
        }

    }
}

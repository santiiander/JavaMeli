package com.mycompany.aprendiendojavagit;

import javax.swing.*;

public class multiplo10 {
    public static void main(String[] args){
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        if (numero%10==0){
            JOptionPane.showMessageDialog(null,"El numero es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }

    }
}

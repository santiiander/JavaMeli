package com.mycompany.aprendiendojavagit;

import javax.swing.*;

public class letramayusomin {
    public static void main(String[] args) {
        char letra;
        letra= JOptionPane.showInputDialog("Ingrese la letra en mayus o minus").charAt(0);
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"La letra es mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"La letra es minuscula");

        }

    }

}

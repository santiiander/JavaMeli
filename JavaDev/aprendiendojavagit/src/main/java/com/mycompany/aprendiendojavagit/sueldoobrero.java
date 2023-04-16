package com.mycompany.aprendiendojavagit;

import javax.swing.*;

public class sueldoobrero {
    public static void main(String[] args) {
        int horas,extras;
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas trabajadas"));
        if (horas<=40){
            JOptionPane.showMessageDialog(null,"Usted cobrará: "+(horas*16));
        }
        else {
            extras=horas-40;
            JOptionPane.showMessageDialog(null,"Usted cobrará: "+(40*16+" de base, y "+extras*20)+" de horas extra!");
        }
    }
}

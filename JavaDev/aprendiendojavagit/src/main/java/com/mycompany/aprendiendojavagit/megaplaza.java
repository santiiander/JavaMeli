package com.mycompany.aprendiendojavagit;

import javax.swing.*;

public class megaplaza {
    public static void main(String[] args) {
        double compra;
        compra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de su compra"));
        if (compra>=300){
            JOptionPane.showMessageDialog(null,"Usted superó la compra minima, se lleva un descuento, nuevo precio: "+(compra-compra*0.20));
        }
    }
}

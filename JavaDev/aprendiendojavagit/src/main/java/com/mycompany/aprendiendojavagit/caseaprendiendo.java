package com.mycompany.aprendiendojavagit;

import javax.swing.JOptionPane;

public class caseaprendiendo {
    public static void main(String[] args){
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero del rango 1 a 5"));

        switch(numero){
            case 1: JOptionPane.showMessageDialog(null, "Es 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Es 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Es 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Es 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "El numero no está en el rango");
                    break;   
            

        }
        while (numero==21){  //el while funciona como en python y el case tambien
            JOptionPane.showMessageDialog(null, "El numero es veintiuno");
            break;
            
        }



    }
    
}

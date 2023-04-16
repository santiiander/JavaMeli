/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aprendiendojavagit;

import javax.swing.JOptionPane;

/**
 *
 * @author santiago
 */
public class ejercicioresolvente {
    public static void main(String[] args){
        double num1,num2,cuadrado;
        JOptionPane.showMessageDialog(null, "Vamos a calcular el cuadrado de una suma de 2 numeros");
        num1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        cuadrado= num1*num1+num2*num2+2*num1*num2;
        JOptionPane.showMessageDialog(null, "El cuadrado del resultado es: "+cuadrado);
    
    }
    
}

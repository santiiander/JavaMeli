
package com.mycompany.aprendiendojavagit;

import javax.swing.JOptionPane;
import java.awt.Color;

public class ejerciciohoras {
    public static void main(String[] args) {
        int horas, semanas, dias, restoHoras;
        
        // Pedir al usuario la cantidad de horas
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de horas:", "Cálculo de semanas, días y horas", JOptionPane.PLAIN_MESSAGE));
        
        // Realizar los cálculos
        semanas = horas / 168;
        dias = (horas % 168) / 24;
        restoHoras = horas % 24;
        
        // Mostrar el resultado en una ventana emergente
        String mensaje = "<html><body style='background-color:#87CEFA'><h3>" + horas + " horas son equivalentes a:</h3><ul><li>" + semanas + " semanas</li><li>" + dias + " días</li><li>" + restoHoras + " horas</li></ul></body></html>";
        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
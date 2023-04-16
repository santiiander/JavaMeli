/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendiendojavagit;

import javax.swing.JOptionPane;

/**
 *
 * @author santiago
 */
public class Aprendiendojavagit {

    public static void main(String[] args) {
        double asistencia,primer,segundo,finalp,notafinal;
        asistencia= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno (Participación)"));
        primer= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno (Primer Parcial)"));
        segundo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno (Segundo Parcial)"));
        finalp= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno (Final Parcial)"));
        notafinal=(0.10*asistencia+0.25*primer+0.25*segundo+0.40*finalp);
       // notafinal=notafinal/4;
        JOptionPane.showMessageDialog(null, "La nota final del alumno es:"+notafinal);
    }
}

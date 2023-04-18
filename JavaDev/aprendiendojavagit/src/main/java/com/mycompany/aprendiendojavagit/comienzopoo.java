package com.mycompany.aprendiendojavagit;

class Libro{
    String nombre;
    String autor;
    int cantidad;

    public Libro(String nombre, String autor, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }
    public int ejemplares(){
        return cantidad;
    }
    public String mostrarlibro(){
        return "Titulo: "+nombre+"Autor: "+autor+"Cantidad: "+cantidad;
    }

}
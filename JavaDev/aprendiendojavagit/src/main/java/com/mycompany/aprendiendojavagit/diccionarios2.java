

//EJERCICIO PENDIENTE XD

package com.mycompany.aprendiendojavagit;
class circuito {
    String nombrecircuito;
    int kilometros;
    String recorrido;
    int preciomenedad;
    int preciomayordeedad;

    public void imprimirDatos() {
        System.out.println("Nombre: " +nombrecircuito );
        System.out.println("Kilometros: " +kilometros );
        System.out.println("Recorrido: "+recorrido);
        System.out.println("Precio si el corredor es menor de edad: "+preciomenedad);
        System.out.println("Precio si el corredor es mayor de edad: "+preciomayordeedad);
    }
class participante{ //número de participante, dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo.
        int numparticipante;
        String nombre;
        String apellido;
        int edad;
        int dni;
        int celular;
        String gruposanguineo;
        int emergenciacell;

}
}

    public class diccionarios2 {
        public static void main(String[] args) {

            circuito MiCircuito=new circuito();
            MiCircuito.nombrecircuito="Circuito Chico";
            MiCircuito.kilometros=2;
            MiCircuito.recorrido="Selva y arroyos";
            MiCircuito.preciomayordeedad=1500;
            MiCircuito.preciomenedad=1300;

            circuito MiCircuito2=new circuito();
            MiCircuito2.nombrecircuito="Circuito Medio";
            MiCircuito2.kilometros=5;
            MiCircuito2.recorrido="Selva, arroyos y  barro";
            MiCircuito2.preciomayordeedad=2300;
            MiCircuito2.preciomenedad=2000;

            circuito MiCircuito3=new circuito();
            MiCircuito3.nombrecircuito="Circuito Avanzado";
            MiCircuito3.kilometros=10;
            MiCircuito3.recorrido="Selva, arroyos, barro y escalada";
            MiCircuito3.preciomayordeedad=3000;
            MiCircuito3.preciomenedad=2500;

            MiCircuito3.imprimirDatos();
            MiCircuito2.imprimirDatos();
            MiCircuito.imprimirDatos();
        }
    }

class persona{
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    public persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    public persona() {

    }
    public persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public double MostrarIMC(double peso,double altura){
        double resultado=peso/(altura*altura);
        if (resultado<20){
            return -1;
        }
        if (resultado>=20 && resultado<=25){
            return 0;
        }
        if (resultado>25){
            return 1;
        }
        return resultado;
    }
    public boolean MayorEdad(int edad){
        if (edad>=18){
            return true;
        }
        else {
            return false;
        }
    }
    public String Datos(String nombre, int edad, String dni, double peso, double altura){
        return "Nombre: "+nombre+" Edad: "+edad+" DNI: "+dni+" Peso: "+peso+" Altura: "+altura;
    }
}

public class Main {
    public static void main(String[] args) {
        persona Personasinparams=new persona();
        persona Personafullparams=new persona("Eduardo",18,"43509123",714.5,0.27);
        persona Persona3params=new persona("Nicolas",17,"44298675");
        System.out.println(Personafullparams.MostrarIMC(Persona3params.peso, Personafullparams.altura));
        System.out.println("La persona es mayor de edad?: "+Personafullparams.MayorEdad(Personafullparams.edad));
        System.out.println("Datos de la persona: "+Personafullparams.Datos(Personafullparams.nombre,Personafullparams.edad,Personafullparams.dni,Personafullparams.peso,Personafullparams.altura));
    }
}

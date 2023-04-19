public class Animal {
    public void makeSound(){
        System.out.println("Ruido de animal");
    }

public static class Gato extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
public static class Perro extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Guau");
    }
}
}



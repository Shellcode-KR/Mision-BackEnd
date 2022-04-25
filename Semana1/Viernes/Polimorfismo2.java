package Semana1.Viernes;

class Animal2{
    void eat(){
        System.out.println("comiendo...");
    }
}
class Dog extends animal{
    void eat(){
        System.out.println("Cominedo Croquetas");

    }
}
class Cachorro extends animal{
    void eat(){
        System.out.println("Tomando agua...");
    }
}
public class Polimorfismo2 {
    public static void main(String[] args) {
        animal dander = new animal();
        dander.eat();
        dander = new Dog();
        dander.eat();
        dander = new Cachorro();
        dander.eat();
    }
}

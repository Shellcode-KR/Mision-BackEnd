package Semana1.Viernes;

class animal{
    String color="Blanco";

    void eat(){
        System.out.println("El animal come");
    }
     animal(){
        System.out.println("Se crea un animal");
    }
}
class Gato extends animal{
    String color="Cafe";
    void printColor(){
        System.out.println("Gato "+color);
        System.out.println("Animal "+super.color);
    }
    void eat(){
        System.out.println("Minino come atun");
    }
    void dormir(){
        System.out.println("michi durmiendo...");
    }
    void call(){
        super.eat();
        dormir();
    }
    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }

}
public class SuperTest {
    public static void main(String[] args) {
        //Objeto anonimo
        new Gato().printColor();

        new Gato().call();

        new Gato();

    }
}

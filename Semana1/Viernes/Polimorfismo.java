package Semana1.Viernes;

class Bike2{
    void run(){
        System.out.println("running...");
    }
}
public class Polimorfismo extends Bike2 {
    @Override
    void run() {
        System.out.println("running Safely with 60miles per hour");

    }

    public static void main(String[] args) {
        Bike2 b1 = new Polimorfismo();
        b1.run();
    }
}

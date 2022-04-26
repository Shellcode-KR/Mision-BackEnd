package Semana2;

abstract class Montain{
    Montain(){
        System.out.println("Se creo una bicicleta de montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a Rojo");
    }
}
class Magistroni extends Montain{
    void cambiarVelocidad(){
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Montain bici1 = new Magistroni();
        bici1.cambiarColor();
        bici1.cambiarVelocidad();

    }
}

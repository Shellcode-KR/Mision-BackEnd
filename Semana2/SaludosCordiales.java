package Semana2;
abstract class Hola{

    void hola(){
        //Como lo hace
        System.out.println("¿Como estas?");
    }
    abstract void saludo();
}
interface Mostrar{
    //Que hace
    void show();
    abstract void despide();

}
public class SaludosCordiales implements Mostrar  {
    public void show() {
        System.out.println("Hola ¿Como estas?");
    }

    @Override
    public void despide() {
        System.out.println("Gracias no");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

}

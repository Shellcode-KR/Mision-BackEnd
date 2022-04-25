package Semana1.Viernes;

class Persona{
    int id;
    String nombre;

    Persona(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
}
public class Empleado extends Persona{
    double salario;
    Empleado(int id, String nombre,double salario) {
        super(id, nombre);
        this.salario=salario;
    }
    void display(){
        System.out.println(id+" "+nombre+" "+salario);
    }
}

class TestPersonaEmpleado{
    public static void main(String[] args) {
        Empleado e1 = new Empleado(001,"Daviv",4550.2);
        e1.display();
    }
}

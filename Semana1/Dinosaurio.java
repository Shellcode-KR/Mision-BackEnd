package Semana1;

public class Dinosaurio {

    public String nombre,alimentacion,era;
    public int peso,altura,longitud;


    public Dinosaurio() {
    }
    public Dinosaurio(String nombre,String alimentacion,String era,int peso,int altura,int longitud){
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.era =era;
        this.peso = peso;
        this.altura = altura;
        this.longitud = longitud;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Soy un dinosaurio {\n" +
                "\tme llamo: " + nombre + "\n" +
                "\tsoy: " + alimentacion + "\n" +
                "\tSoy de la era: " + era + "\n" +
                "\tpeso: " + peso + "\n" +
                "\tmi altura es: " + altura + "m.\n" +
                "\tmi longitud es: " + longitud + "m.\n" +
                "}";
    }
}


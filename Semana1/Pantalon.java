package Semana1;

public class Pantalon {
    public int  largo,size;
    public String tela, color;

    public Pantalon(int largo, int size, String material, String color) {
        this.largo = largo;
        this.size = size;
        this.tela = material;
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return tela;
    }

    public void setMaterial(String material) {
        this.tela = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Soy un Pantalon\n" +
                "\tlargo: " + largo +"\n"+
                "\tmedida: " + size +"\n"+
                "\ttela: " + tela +"\n"+
                "\tcolor='" + color + "\n";
    }
}

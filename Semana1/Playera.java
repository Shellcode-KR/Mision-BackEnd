package Semana1;

public class Playera {
    public char size;
    public String color, tela;

    public Playera(char size, String color, String tela) {
        this.size = size;
        this.color = color;
        this.tela = tela;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public String toString() {
        return "Soy una playera:\n" +
                "\tde tamaño: " + size +'\n' +
                "\tcolor: " + color + '\n' +
                "\ty tela: " + tela + '\n' ;
    }
}

package Semana1;

public class Zapato {
    public int numeromx,empeine,ancho;
    public String materialSuela, materialZapato;

    public Zapato(int numeromx, int empeine, int ancho, String materialSuela, String materialZapato) {
        this.numeromx = numeromx;
        this.empeine = empeine;
        this.ancho = ancho;
        this.materialSuela = materialSuela;
        this.materialZapato = materialZapato;
    }

    public int getNumeromx() {
        return numeromx;
    }

    public void setNumeromx(int numeromx) {
        this.numeromx = numeromx;
    }

    public int getEmpeine() {
        return empeine;
    }

    public void setEmpeine(int empeine) {
        this.empeine = empeine;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getMaterialSuela() {
        return materialSuela;
    }

    public void setMaterialSuela(String materialSuela) {
        this.materialSuela = materialSuela;
    }

    public String getMaterialZapato() {
        return materialZapato;
    }

    public void setMaterialZapato(String materialZapato) {
        this.materialZapato = materialZapato;
    }

    @Override
    public String toString() {
        return "Soy un Zapato: " +"\n "+
                "\tDe numero mx: " + numeromx +"\n "+
                "\t mi empeine es: " + empeine +"\n "+
                "\t mi ancho es: " + ancho +"\n "+
                "\t el  material de la Suela es: " + materialSuela + '\n' +
                "\t el material del Zapato es: " + materialZapato + '\n' +
                '}';
    }
}

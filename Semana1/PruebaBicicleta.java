package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        def();
    }
    public static void def(){
        Bicicleta biciMontain = new Bicicleta();
        biciMontain.setColor("Negra");
        biciMontain.setPins(6);
        biciMontain.setRodada(25);
        biciMontain.setVelocidad(13.2);
        String msg = "Soy una bici de montaña de \ncolor "+biciMontain.getColor()+
                " \nvelocidad "+biciMontain.getVelocidad()+
                "\nPines "+biciMontain.getPins()+
                "\nRodada "+biciMontain.getRodada();
        System.out.print(msg);
    }

}

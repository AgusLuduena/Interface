package Objetos;

public class CocheHibrido extends Coche {
    String motorHibrido;
    public CocheHibrido(){

    }
    public CocheHibrido(String motorHibrido, String color, String fabricante, String modelo, Double largo, Double peso) {
        super(color,fabricante,modelo,largo,peso);
        this.motorHibrido = motorHibrido;

    }

    @Override
    public String toString() {
        return "CocheHibrido:" +"\n"+
                "motorHibrido =" + motorHibrido +"\n"+
                "color =" + color +"\n"+
                "fabricante =" + fabricante  +"\n"+
                "modelo =" + modelo + "\n"+
                "largo =" + largo +"\n"+
                "peso =" + peso + "\n"+
                "velocidad =" + velocidad +"\n";
    }

}

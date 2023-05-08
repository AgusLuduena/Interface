package Objetos;

public class CocheElectrico extends Coche {

    String motorElectrico;
    public CocheElectrico(){

    }
    public CocheElectrico(String motorElectrico, String color, String fabricante, String modelo, Double largo, Double peso) {
        super(color,fabricante,modelo,largo,peso);
        this.motorElectrico = motorElectrico;

    }

    @Override
    public String toString() {
        return "CocheElectrico:" +"\n"+
                "MotorElectrico= " + motorElectrico +"/ "+
                "Color= " + color +"/ "+
                "Fabricante= " + fabricante  +"/ "+
                "Modelo= " + modelo + "/ "+
                "Largo= " + largo +"/ "+
                "Peso= " + peso + "/ "+
                "Velocidad= " + velocidad +".";
    }

} 

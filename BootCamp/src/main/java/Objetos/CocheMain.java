package Objetos;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        //objeto
   //     Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 4.5, 1430.45); //instancia de una clase

        cocheObj2.acelerar(50);


        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Electrico";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("TXZ","Azul","Alfa",
                                                             "Romeo",4.99,1500d);
        System.out.println(cocheElectrico2);

        CocheHibrido cocheHibrido = new CocheHibrido();
    }
}

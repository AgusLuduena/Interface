package Clases;

public class Main {
    public static void main(String[] args) {

        Motor motorGTI = new Motor(190, 2.1,6,"GTI");
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1,2010, false);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);


    }
}

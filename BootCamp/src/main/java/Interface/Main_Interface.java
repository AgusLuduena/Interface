package Interface;

import SinInterface.Empleado;
import SinInterface.EmpleadoCRUD;

public class Main_Interface {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

    public static void main(String[] args) {

        empleadoCRUD.findAll();
        //empleadoCRUD.save
    }
}

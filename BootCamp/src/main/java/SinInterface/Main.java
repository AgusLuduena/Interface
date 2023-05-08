package SinInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30, 4000, true);
        Empleado rosa = new Empleado("Rosa", 32, 4200,false);
        Empleado ana = new Empleado("Ana", 33, 4100, true);

        empleadoCRUD.save(juanito);
        empleadoCRUD.save(rosa);
        empleadoCRUD.save(ana);


        List<Empleado>empleados = empleadoCRUD.findAll();
        System.out.println(empleados);


    }

}

package SinInterface;

import java.util.ArrayList;
import java.util.List;

//  BASE DE DATOS   //
public class EmpleadoCRUD {

        //      Creacion de Metodos     //

        List<Empleado> empleados = new ArrayList<>();


        // Guardar Empleados
        public void save(Empleado empleado){
                empleados.add(empleado);
        }

        // Leer Empleados
        public List<Empleado> findAll(){
                return empleados;
        }


}
package Interface;

import SinInterface.Empleado;

import java.util.List;

public interface EmpleadoCRUDIntf {

    void save(Empleado empleado);

    List<Empleado> finAll();
    void delete (Empleado empleado);
}

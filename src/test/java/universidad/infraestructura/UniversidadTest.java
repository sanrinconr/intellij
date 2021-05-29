package universidad.infraestructura;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UniversidadTest {
    @Test
    public void obtenerDepartamentos(){
        Departamento admin = new Departamento("Administrador");
        Departamento est = new Departamento(("Estudiantes"));
        Universidad uni = new Universidad("Distrital","Bogota");
        uni.agregarDepartamento(admin);
        uni.agregarDepartamento(est);
        Assert.assertEquals(uni.getDepartamentos().get(1),est);

    }

}

package universidad.personal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import universidad.infraestructura.Departamento;
import universidad.infraestructura.Universidad;
import universidad.trabajos.PAS;

public class EstudianteTest {
    private Departamento admin = new Departamento("Administrativo");
    private Universidad uni = new Universidad("UNAL", "Bogota");
    private Estudiante es = new Estudiante("Juan","123",uni);

    @Before
    public void relaciones(){
        uni.agregarDepartamento(admin);
    }
    @Test
    public void saludo(){
        Assert.assertEquals("Hola soy un estudiante de la u: UNAL", es.saludar());
    }
}

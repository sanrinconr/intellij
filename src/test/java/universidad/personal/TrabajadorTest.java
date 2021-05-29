package universidad.personal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import universidad.infraestructura.Departamento;
import universidad.infraestructura.Universidad;
import universidad.trabajos.PAS;

public class TrabajadorTest {
    private Departamento admin = new Departamento("Administrativo");
    private Universidad uni = new Universidad("UNAL", "Bogota");
    private PAS trabajo = new PAS("Limpiador");
    private Trabajador trab = new Trabajador("Juan","123","2020",uni,admin,trabajo);

    @Before
    public void relaciones(){
        uni.agregarDepartamento(admin);
    }
    @Test
    public void saludo(){
        String salida =trab.saludar();
        Assert.assertEquals("Hola soy un trabajador de la u: UNAL",salida);
    }

    @Test
    public void departamento(){
        Assert.assertEquals("Administrativo",trab.getDepartamento().getNombre());
    }
}

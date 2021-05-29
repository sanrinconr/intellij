package universidad.personal;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {
    @Test
    public void saludo(){
        Persona p = new Persona("Carlos","10");
        Assert.assertEquals("Hola como estas?, soy una persona",p.saludar());
    }
}

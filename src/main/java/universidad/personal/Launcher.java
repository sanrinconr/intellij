package universidad.personal;

import universidad.infraestructura.Departamento;
import universidad.infraestructura.Universidad;
import universidad.trabajos.PAS;

public class Launcher {
    public static void main(String[] args) {
        Universidad distrital = new Universidad("Distrital Francisco Jose de caldas","Bogota DC");
        distrital.agregarDepartamento(new Departamento("Administrativo"));
        distrital.agregarDepartamento(new Departamento("Estudiantes"));
        Persona persona = new Trabajador(
                "Juan",
                "1000",
                "2020",
                distrital,
                distrital.getDepartamentos().get(0),
                new PAS("Limpiador"));
        System.out.println("ww");
    }
}

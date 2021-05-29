package universidad.personal;

import universidad.infraestructura.Departamento;
import universidad.infraestructura.Universidad;
import universidad.trabajos.PAS;
import universidad.trabajos.PDI;

public class Trabajador extends Persona{
    String fechaInicio;
    Universidad universidad;
    Departamento departamento;
    PAS trabajo;

    public Trabajador(String nombre,
                      String ID,
                      String fechaInicio,
                      Universidad universidad,
                      Departamento departamento,
                      PAS trabajo)
    {
        super(nombre, ID);
        this.fechaInicio = fechaInicio;
        this.universidad = universidad;
        this.departamento = departamento;
        this.trabajo = trabajo;
    }

    @Override
    public String saludar() {
        return "Hola soy un trabajador de la u: "+universidad.getNombre();
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

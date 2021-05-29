package universidad.personal;

import universidad.infraestructura.Departamento;
import universidad.infraestructura.Universidad;
import universidad.trabajos.PAS;
import universidad.trabajos.PDI;

public class Doctor extends Trabajador{
    private PDI trabajoEducativo;
    public Doctor(String nombre,
                  String ID,
                  String fechaInicio,
                  Universidad universidad,
                  Departamento departamento,
                  PAS trabajo,
                  PDI trabajoEducativo
    )
    {
        super(nombre, ID, fechaInicio, universidad, departamento, trabajo);
        this.trabajoEducativo = trabajoEducativo;
    }
}

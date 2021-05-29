package universidad.personal;

import universidad.infraestructura.Universidad;

public class Estudiante extends Persona implements Saludo {
    Universidad universidad;

    public Estudiante(String nombre, String ID, Universidad universidad){
        super(nombre, ID);
        this.universidad = universidad;
    }

    @Override
    public String saludar() {
        return "Hola soy un estudiante de la u: "+universidad.getNombre();
    }
}

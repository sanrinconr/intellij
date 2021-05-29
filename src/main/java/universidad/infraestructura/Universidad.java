package universidad.infraestructura;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String ciudad;
    private ArrayList<Departamento> departamentos;

    /**
     * Constructor
     * @param nombre nombre de la universidad
     * @param ciudad ubicacion de la u
     */
    public Universidad(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamentos = new ArrayList<Departamento>();
    }

    /**
     * Metodos
     */

    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }


    /**
     * Getters y setters
     */

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

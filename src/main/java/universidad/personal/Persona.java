package universidad.personal;

public class Persona implements Saludo {
    private String nombre;
    private String ID;

    public Persona(String nombre, String ID){
        this.nombre = nombre;
        this.ID = ID;
    }
    /**
     * Metodos
     */
    public String saludar(){
        return "Hola como estas?, soy una persona";
    }
    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}

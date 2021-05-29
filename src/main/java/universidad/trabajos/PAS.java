package universidad.trabajos;

public class PAS {
    String puesto;

    public PAS(String puesto){
        this.puesto = puesto;
    }
    public String administrar(){
        return "Aqui ando en PAS administrando jaja";
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

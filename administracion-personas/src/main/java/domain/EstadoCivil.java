package domain;

public class EstadoCivil {

    private int id;
    private String nombre;

    public EstadoCivil() {
    }

    public EstadoCivil(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return id + " " +nombre;
    }
}
 

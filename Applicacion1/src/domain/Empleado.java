package domain;

public class Empleado  extends  Persona{
    //Atributos
    private static int id;
    private String departamento;
    private String puesto;

    //Constructor
    public Empleado(String nombre, String departamento, String puesto) {
        super(nombre);
        id++;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    //Metodos

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Empleado.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "departamento='" + departamento + '\'' +
                ", puesto='" + puesto + '\'' +
                ", ID='" + id + '\'' +
                '}';
    }
}

package Domain;

public class Empleado  extends Persona{
    //Atributos
    private static int id;
    private int empId;
    private double salary;
    private String department;
    private int category;

    //Constructor
    public Empleado(){
        this.empId = ++Empleado.id;
    };

    public Empleado(String name){
        this();
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Empleado.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}

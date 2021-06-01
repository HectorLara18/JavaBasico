package domain;

public class Empleado extends Person {
    //Atributos
    private boolean employeerStatus;

    //constructor
    public Empleado(String name){
        super(name);
        this.employeerStatus = true;
    }

    //Metodos

    public void setEmployeerStatus(boolean status){
        this.employeerStatus = status;
    }

    public boolean isEmployeerStatus(){
        return this.employeerStatus;
    }

    @Override
    public String toString(){
        return "Name: " + this.name +
        " Age: " + this.age +
        " Correo: " + this.correo +
        " Status: " + this.employeerStatus;
    }

}

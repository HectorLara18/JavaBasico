package domain;

public final class Empleado extends Persona{

    //Atributos
    String name;

    //Constructor

    public Empleado(){

    }

    public Empleado(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void imprimir() {
        System.out.println("Se imprime desde clase hija" + name);
    }


}

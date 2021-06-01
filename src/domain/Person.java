package domain;

import java.util.Date;

public class Person {
    //Atributps
    protected String name;
    protected int age;
    protected Date fechaIngreso;
    protected int personId;
    public static int id;
    protected String correo;

    //Constructor
    public Person(String name) {
        this.name = name;
        fechaIngreso = new Date();
        personId = ++id;

    }

    //Metodos

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public Date getFechaIngreso(){
        return this.fechaIngreso;
    }

    public int getPersonId(){
        return this.personId;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo(){
        return this.correo;
    }


    @Override
    public String toString() {
        return "Name: " + this.name +
                " Age: " + this.age +
                " Fecha de ingreso: " + this.fechaIngreso +
                " PersonID: " + this.personId;
    }
}

package test;

import domain.Persona;

public class Clientes extends Persona {
    //Atributos
    public static int id;
    private String phone;

    //Constructor
    public Clientes(String name) {
        super(name);
        id++;
    }

    //Metodos

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Clientes.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " ID: " + id + " Phone: " + phone;
    }
}

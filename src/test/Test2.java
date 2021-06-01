package test;

import domain.Empleado;

public class Test2 {

    public static void main(String[] args){

        Empleado empleado1 = new Empleado("Hector Lara");
        empleado1.setCorreo("hectorlaras.18@gmail.com");
        empleado1.setAge(28);
        System.out.println(empleado1.toString());
        empleado1.setEmployeerStatus(false);
        System.out.println(empleado1.toString());
    }
}

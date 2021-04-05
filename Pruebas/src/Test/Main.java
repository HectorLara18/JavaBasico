package Test;

import Domain.Empleado;
import Domain.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.fechaDeNacimiento(1992, 12, 18);
        System.out.println(persona1.getBirthDate());

        Empleado empleado1 = new Empleado("Hector Lara");
        System.out.println(empleado1.getEmpId());

        Empleado empleado2 = new Empleado("Raul Lara");
        System.out.println(empleado2.getEmpId());
    }
}

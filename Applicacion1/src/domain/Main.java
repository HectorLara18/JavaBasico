package domain;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Hector Lara");
        persona1.setAge(28);
        System.out.println(persona1.toString());

        Empleado empleado1 = new Empleado("Hector Lara", "TI", "Desarrollador Sr");
        System.out.println(empleado1.toString());
    }
}

package test;

import domain.Person;

public class Test {
    public static void main(String[] args) {
        Person persona1 = new Person("Hector Lara");
        Person persona2 = new Person("Raul Lara");
        persona1.setAge(28);
        System.out.println(persona1.getPersonId());
        System.out.println(persona1.getFechaIngreso());
        System.out.println(persona2.getPersonId());
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}

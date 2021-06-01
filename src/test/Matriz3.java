package test;
import domain.Person;

import static domain.Metodos.imprimir;

public class Matriz3 {
    public static void main(String[] args) {
        Person personas[][] = new Person[2][2];

        personas[0][0] = new Person("Hector");
        personas[0][1] = new Person("Raul");
        personas[1][0] = new Person("Jazmin");
        personas[1][1] = new Person("Carlos");

        imprimir(personas);

    }
}

package test;

import domain.Person;

public class Personas {
    public static void main(String[] args){

        Person personas[][] = new Person[2][2];
        personas[0][0] = new Person("Hector Lara");
        personas[0][1] = new Person("Raul Lara");
        personas[1][0] = new Person("Humberto Salas");
        personas[1][1] = new Person("Jazmin Banda");

        for (int ren = 0; ren < personas.length; ren++){
            for (int col = 0; col < personas[ren].length; col++){
                System.out.println(personas[ren][col].getName());
            }
        }
    }
}

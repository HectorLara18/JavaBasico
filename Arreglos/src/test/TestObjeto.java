package test;

import domain.Persona;

public class TestObjeto {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Hector Lara");
        Persona persona2 = new Persona("Raul Lara");
        Persona persona3 = new Persona("Jazmin Banda");

        Persona personas[] = new Persona[4];

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;

        for (int x = 0; x < personas.length; x++) {
            System.out.println(x);
            if(personas[x] != null){
                System.out.println(personas[x].getName());
            } else {
                System.out.println("empty person");
            }
        }
    }
}

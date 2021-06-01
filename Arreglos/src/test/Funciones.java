package test;

import domain.Persona;

public class Funciones {

    public static boolean checarGrupo(Persona[] personas) {
        int cantidad = personas.length;
        int x;
        for (x = 0; x < cantidad; x++){
            System.out.println("Todo ok");
        }
        System.out.println(x);
        boolean salida = x == 0 ? x > 0;
        return  salida;
    }
}

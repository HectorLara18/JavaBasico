package test;

import Operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(12, 11);
        System.out.println("resultado = " + resultado);
        
        double resultado2 = Operaciones.sumar(10.0, 12.0);
        System.out.println("resultado2 = " + resultado2);

        double resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);
    }
}

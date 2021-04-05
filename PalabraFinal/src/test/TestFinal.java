package test;

import domain.Empleado;
import domain.Persona;

import javax.swing.tree.DefaultMutableTreeNode;
import static domain.Empleado.*;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        Empleado empleado1 = new Empleado();
        empleado1.imprimir();

        System.out.println(MI_CONSTANTE);
    }
}

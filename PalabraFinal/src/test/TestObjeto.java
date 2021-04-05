package test;

import domain.Empleado;
import org.w3c.dom.ls.LSOutput;

public class TestObjeto {
    public static void main(String[] args) {
        Empleado emṕleado1 = new Empleado("Hector Lara");
        System.out.println(emṕleado1);
        final Empleado empleado2 = new Empleado("Raul Lara");
        Empleado empleado3 = new Empleado("Eduardo Lara");
        empleado3 = emṕleado1;
        empleado2.setName("Eduardo Lara");
    }
}

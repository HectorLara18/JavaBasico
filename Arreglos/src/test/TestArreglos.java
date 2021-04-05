package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        for (int x = 0; x < edades.length; x++) {
            System.out.println(edades[x]);
            edades[x] = x;
            System.out.println(edades[x]);
        }
    }
}

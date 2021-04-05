package test;

public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Raul Lara");
        cliente1.setPhone("8182875719");
        System.out.println(cliente1.toString());
        System.out.println(cliente1.id);
    }
}

package domain;

public class Persona {
    //Atributos
    String name;
    public static final int MI_CONSTANTE = 10;

    public void imprimir() {
        System.out.println("Metodo que imprime desde clase");
    }

    public final String getName() {
        return this.name;
    }
}

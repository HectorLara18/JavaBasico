package test;

public class Matriz2 {
    public static void main(String[] args) {
        String frutas[][] = new String[3][2];
        String frutas2[][] = {{"naranja", "Limon"},{"fresa", "Zarzamora", "Mora"}};

        for (int ren = 0; ren < frutas2.length;ren++){
            for (int col = 0; col < frutas2[ren].length; col++){
                System.out.println("Frutas: " + frutas2[ren][col] + " incide: " + ren + "x" + col);
            }
        }
    }
}

package test;

public class Matriz1 {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        edades[0][0] = 5;
        edades[0][1] = 15;
        edades[1][0] = 4;
        edades[1][1] = 7;
        edades[2][0] = 2;
        edades[2][1] = 5;

        for (int ren = 0; ren < edades.length; ren++){
            for(int col = 0; col < edades[ren].length; col++){
                System.out.println("edades: " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }

    }
}

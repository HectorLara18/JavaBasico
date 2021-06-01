package domain;

public class Metodos {

    public static void imprimir(Object matriz[][]){
        for(int ren = 0; ren < matriz.length; ren++){
            for (int col = 0; col < matriz[ren].length;col++){
                System.out.println(matriz[ren][col].toString());
            }
        }
    }
}

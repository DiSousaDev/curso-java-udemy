package Aula96;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] matriz = new int[n][n];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = scan.nextInt();
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print("|"+ matriz[l][c] +"|");
            }
            System.out.println();
        }

        System.out.println("Diagonal principal");

        for (int l = 0; l < matriz.length; l++) {
            System.out.print(matriz[l][l]);
        }
        System.out.println();
        int contador = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if(matriz[l][c] < 0){
                    contador ++;
                }
            }
        }
        System.out.println("Numeros negativos: "+ contador);

        scan.close();
    }

}

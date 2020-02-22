package Aula97;

import java.util.Scanner;

public class ExerMatriz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] matriz = new int[n][m];

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

        System.out.println("Digite um numero para buscar: ");
        int num = scan.nextInt();
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] == num){
                    System.out.println("Posição: " + l + "," + c);
                }
            }
        }

    }
}

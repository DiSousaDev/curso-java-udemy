package ExerciciosMatriz;

public class Matriz {

    public static int LIN = 5;
    public static int COL = 7;

    public static void main(String[] args) {


        int[][] mat = new int[LIN][COL];

        int valor=0,maior=0;

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = valor += (+1);
            }
        }

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                System.out.printf("|\t%d\t|", mat[l][c]);
            }
            System.out.println();
        }

        for (int l=0; l < mat.length; l++) {
            for (int c=0; c < mat[l].length; c++){
                if(mat[l][c] > maior){
                    maior = mat[l][c];
                }
            }
        }
        System.out.printf("\n");
        System.out.printf("*******************************\n");
        System.out.printf("\nO Maior valor e: %d\n\n",maior);
        System.out.printf("*******************************\n");

    }
}

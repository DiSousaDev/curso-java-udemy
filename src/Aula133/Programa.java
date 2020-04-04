package Aula133;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        metodo1();
        System.out.println("Fim do programa.");
    }
    public static void metodo1(){
        System.out.println("Metodo 1 iniciado");
        metodo2();
        System.out.println("Metodo 1 finalizado");
    }

    public static void metodo2(){
        System.out.println("Metodo 2 iniciado");
        Scanner scan = new Scanner(System.in);

        try {

            String[] vetor = scan.nextLine().split(" ");
            int posicao = scan.nextInt();
            System.out.println(vetor[posicao]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida.");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Valor inserido é inválido.");
            e.printStackTrace();
        }
        scan.close();
        System.out.println("Metodo 2 Final");
    }
}

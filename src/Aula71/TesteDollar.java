package Aula71;

import java.util.Scanner;

public class TesteDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a cotação do dollar?");
        double valor = scan.nextDouble();
        System.out.println("Quantos dolares deseja adquirir?");
        double total = scan.nextDouble();

        double resultado = Dollar.conversaoAtual(valor,total);

        System.out.println("Valor a pagar em reais: " + resultado);
    scan.close();
    }
}

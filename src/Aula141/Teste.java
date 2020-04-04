package Aula141;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com as informações da conta:");
        System.out.print("Número:");
        int numero = scan.nextInt();
        System.out.print("Cliente:");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.print("Saldo inicial:");
        double saldo = scan.nextDouble();
        System.out.println("Limite para saques:");
        double limiteSaque = scan.nextDouble();

        ContaCorrente conta = new ContaCorrente(numero,nome,saldo,limiteSaque);

        System.out.print("Insira o valor do Saque:");
        double valorSaque = scan.nextDouble();

            conta.efetuarSaque(valorSaque);
            System.out.println("Novo Saldo: " + conta.getSaldoInicial());
        }
        catch (DepositException e){
            System.out.println("Erro de saque: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Erro ao inserir numero da conta: " + e);
        }
    }
}

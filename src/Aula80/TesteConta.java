package Aula80;

import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        String numConta = scan.nextLine();
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scan.nextLine();
        ContaBancaria cliente1 = new ContaBancaria(nomeCliente, numConta);

        System.out.println("Deseja efetuar um deposito inicial (s/n)?");
        char resp = scan.next().charAt(0);

        if(resp == 's'){
            System.out.println("Digite o valor do depósito inicial:");
            double valor = scan.nextDouble();
            cliente1.efetuarDeposito(valor);
        }
        System.out.println("Informações da conta:");
        System.out.println(cliente1);

        System.out.println("Digite o valor do depósito:");
        double valor = scan.nextDouble();
        cliente1.efetuarDeposito(valor);

        System.out.println("Atualizando Informações da conta:");
        System.out.println(cliente1);

        System.out.println("Digite o valor do saque:");
        double valorDoSaque = scan.nextDouble();
        cliente1.efetuarSaque(valorDoSaque);

        System.out.println("Atualizando Informações da conta:");
        System.out.println(cliente1);

    }

}

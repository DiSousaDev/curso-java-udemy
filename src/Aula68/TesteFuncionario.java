package Aula68;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Digite o nome do funcionário:");
        func.nome = scan.nextLine();
        System.out.println("Digite o Salário Bruto:");
        func.salarioBruto = scan.nextDouble();
        System.out.println("Digite o valor do imposto:");
        func.imposto = scan.nextDouble();

        System.out.println("Funcionário: " + func);

        System.out.println("Qual o percentual do aumento?");
        double percent = scan.nextDouble();
        func.aumentarSalario(percent);

        System.out.println("Salário Atualizado: " + func);
    }
}

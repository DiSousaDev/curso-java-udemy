package Aula94;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Funcionários deseja cadastrar?");
        int n = scan.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Funcionario #"+ (i+1));
            System.out.println("Id:");
            int id = scan.nextInt();
            System.out.println("Nome:");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.println("Salário:");
            double salario = scan.nextDouble();
            list.add(new Funcionario(id,nome,salario));
        }
        System.out.println();
        System.out.println("Insira o id do funcionário que deseja reajustar?");
            int id = scan.nextInt();
            Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Funcionario nao encontrado!");
        }
        else {
            System.out.print("Insira o valor percentual: ");
            double porcentagem = scan.nextDouble();
            func.reajustarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Listando Funcionarios:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

        scan.close();


    }

}

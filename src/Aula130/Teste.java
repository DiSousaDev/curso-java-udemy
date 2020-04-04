package Aula130;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Insira o numero de devedores:");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Informações do devedor #" + i + ":");
            System.out.print("Pessoa Fisica ou Jurídica? (f/j)");
            int ch = scan.next().charAt(0);
            System.out.print("Nome:");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Renda Anual:");
            double rendaAnual = scan.nextDouble();
            if(ch == 'f'){
                System.out.print("Despesas com saúde:");
                double despSaude = scan.nextDouble();
                pessoas.add(new PessoaFisica(nome,rendaAnual,despSaude));
            }else if (ch == 'j'){
                System.out.print("Número de Funcionários:");
                int numFunc = scan.nextInt();
                pessoas.add(new PessoaJuridica(nome,rendaAnual,numFunc));
            }else {
                System.out.println("Opção Inválida!");
            }
        }
        System.out.println();
        System.out.println("TARIFAS PAGAS:");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.calcularImpostos()));
        }
        System.out.println();
        double soma = 0;
        for(Pessoa pessoa : pessoas){
            soma += pessoa.calcularImpostos();
        }
        System.out.print("TOTAL ARRECADADO: $ " + String.format("%.2f", soma));
    }
}

package Aula89;

import java.util.Locale;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno[] alunos = new Aluno[9];

        System.out.println("Quantos quartos serão alugados?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Cliente #" + (i + 1));
            scan.nextLine();
            System.out.println("Nome: ");
            String nome = scan.nextLine();
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Quarto: ");
            int quarto = scan.nextInt();
            alunos[quarto] = new Aluno(nome, email);
        }
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println(i + ":" + alunos[i]);
            }
        }
    }

}

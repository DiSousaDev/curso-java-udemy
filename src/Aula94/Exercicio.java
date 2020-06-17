package Aula94;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = scan.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = scan.nextInt();
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Salary: ");
            double salary = scan.nextDouble();
            Funcionario obj = new Funcionario(id, name, salary);
            funcionarios.add(obj);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        n = scan.nextInt();
        System.out.print("Enter the percentage: ");
        double percent = scan.nextDouble();

        boolean ok = false;
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == n){
                funcionario.reajustarSalario(percent);
                ok = true;
            }
        }

        if(ok){
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }else{
            System.out.println("Id não encontrado.");
        }

    }
}

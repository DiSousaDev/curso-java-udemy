package Aula115;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o nome do departamento:");
        String departamento = scan.nextLine();
        System.out.println("Dados do trabalhador:");
        System.out.print("Nome:");
        String nome = scan.nextLine();
        System.out.print("Nível:");
        String nivel = scan.nextLine();
        System.out.print("Salário Base:");
        double salario = scan.nextDouble();

        Trabalhador trabalhador1 = new Trabalhador(nome,NivelTrabalho.valueOf(nivel),salario,new Departamento(departamento));

        System.out.print("Quantos contratos para este trabalhador? ");
        int n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Insira os dados do contrato #"+i);
            System.out.print("Data (DD/MM/AAAA):");
            Date dataContrato = sdf.parse(scan.next());
            System.out.print("Valor por hora:");
            double valor = scan.nextDouble();
            System.out.print("Duração (horas):");
            int horas = scan.nextInt();
            HoraContrato contrato = new HoraContrato(dataContrato,valor,horas);
            trabalhador1.aicionarContrato(contrato);
        }
        System.out.println();
        System.out.println("Insira o mes e ano que deseja buscar (MM/AAAA)");
        String dataBusca = scan.next();
        int mes = Integer.parseInt(dataBusca.substring(0,2));
        int ano = Integer.parseInt(dataBusca.substring(3));
        System.out.println("Nome: " + trabalhador1.getNome());
        System.out.println("Departamento: " + trabalhador1.getDepartamento().getNome());
        System.out.println("Valor recebido em " + dataBusca + ":" + String.format("%.2f", trabalhador1.qtdRecebida(ano,mes)));

        scan.close();
    }
}

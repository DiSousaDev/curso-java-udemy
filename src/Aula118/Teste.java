package Aula118;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira as informações do cliente:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("E-mail: ");
        String email = scan.nextLine();
        System.out.print("Data de aniversário (DD/MM/YYYY): ");
        Date data = sdf.parse(scan.nextLine());

        Cliente cliente1 = new Cliente(nome, email, data);


        System.out.println("Inserindo informações do pedido:");
        System.out.println("Status:");
        StatusPedido status = StatusPedido.valueOf(scan.nextLine());

        Pedido ped1 = new Pedido(new Date(), status, cliente1);

        System.out.println("Quantos itens você deseja cadastrar?");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com as informações do item #" + i);
            System.out.print("Nome do Produto: ");
            scan.nextLine();
            String nomeDoProduto = scan.nextLine();
            System.out.print("Preço do Produto");
            double precoProduto = scan.nextDouble();

            Produto produto = new Produto(nomeDoProduto, precoProduto);

            System.out.print("Quantidade: ");
            int qtd = scan.nextInt();

            ItemPedido itemPedido = new ItemPedido(qtd, precoProduto, produto);

            ped1.adicionarItem(itemPedido);
        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(ped1);

        scan.close();
    }
}

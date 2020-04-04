package Aula127;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Teste {
    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o numero de produtos:");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Produto #" + i + " informações:"  );
            System.out.print("Comum, usado ou importado (c | u | i)?");
            char c = scan.next().charAt(0);

            System.out.print("Nome:");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Preço:");
            double preco = scan.nextDouble();

            if (c == 'i') {
                System.out.print("Tarifa de importação:");
                double tarifa = scan.nextDouble();
                produtos.add(new ProdutoImportado(nome,preco,tarifa));
            }else if(c == 'u'){
                System.out.print("Data de Fabricação: (DD/MM/YYYY)");
                Date data = sdf.parse(scan.next());
                produtos.add(new ProdutoUsado(nome,preco,data));
            }else{
                produtos.add(new Produto(nome,preco));
            }
        }
        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for(Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
        }
        scan.close();
    }
}
package Aula65;

public class TesteProduto {
    public static void main(String[] args) {
        Produto tv = new Produto();

        tv.nome = "Philco";
        tv.preco = 500.00;
        tv.quantidade = 10;

        System.out.println("Informações do Produto: " + tv);
        tv.adicionarProduto(5);
        System.out.println("Atualizando Estoque: " + tv);
        tv.removerProduto(10);
        System.out.println("Atualizando estoque: " + tv);
    }
}

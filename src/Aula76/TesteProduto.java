package Aula76;


public class TesteProduto {

        public static void main(String[] args) {
            Produto tv = new Produto("TV",900.00);

            System.out.println("Informações do Produto: " + tv);
            tv.adicionarProduto(5);
            System.out.println("Atualizando Estoque: " + tv);
            tv.removerProduto(10);
            System.out.println("Atualizando estoque: " + tv);
        }

}

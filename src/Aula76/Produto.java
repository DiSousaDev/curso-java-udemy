package Aula76;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
    }

   public double valorTotalEstoque() {
        return getQuantidade() * getPreco();
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        String s = getNome() + ", R$" + String.format("%.2f", getPreco()) + ", "
                + getQuantidade() + " unidades. Total: R$" + String.format("%.2f", valorTotalEstoque());
        return s;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

}

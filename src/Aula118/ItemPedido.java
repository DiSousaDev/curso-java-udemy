package Aula118;

public class ItemPedido {

    private int quantidade;
    private double precoItem;

    private Produto produto;

    public ItemPedido(int quantidade, double precoItem, Produto produto) {
        this.quantidade = quantidade;
        this.precoItem = precoItem;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal() {
        return quantidade * precoItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(produto.getNome());
        sb.append(", R$");
        sb.append(String.format("%.2f", precoItem));
        sb.append(", Quantidade: ");
        sb.append(quantidade);
        sb.append(", Subtotal: $");
        sb.append(String.format("%.2f", subTotal()));
        return sb.toString();
    }
}

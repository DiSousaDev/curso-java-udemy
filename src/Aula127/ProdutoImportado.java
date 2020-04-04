package Aula127;

public class ProdutoImportado extends Produto {

    private double taxaImportacao;

    public ProdutoImportado(){
    }

    public ProdutoImportado(String nome, Double preco, double taxaImportacao){
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao(){
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }
    public double valorTotal(){
        return getPreco() + taxaImportacao;
    }
    public String etiquetaPreco(){
        return getNome() + " $ " +  String.format("%.2f",valorTotal()) + " (Tarifa de importação: $ " + String.format("%.2f",taxaImportacao) + ")";
    }
}

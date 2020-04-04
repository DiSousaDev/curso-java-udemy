package Aula122;

public class PoupancaFisica extends ContaCorrente{

    private double taxaDeJuros;
    private String cpf;

    public PoupancaFisica() {
        super();
    }

    public PoupancaFisica(String numero, String titular, double saldo, double taxaDeJuros, String cpf) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
        this.cpf = cpf;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    public void efetuarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Saldo: R$" + saldo);
        }
    }

}

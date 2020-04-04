package Aula122;

public class ContaCorrente {
    private String numero;
    private String titular;
    protected double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void efetuarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor + 0.5;
        } else {
            System.out.println("Saldo insuficiente. Saldo: R$" + saldo);
        }
    }

    public void efetuarDeposito(double valor) {
        saldo += valor;
    }
}

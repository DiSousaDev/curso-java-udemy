package Aula80;

public class ContaBancaria {

    public static double TAXA = 5;

    private String nome;
    private String conta;
    private double saldo;

    public ContaBancaria(String nome, String conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void efetuarDeposito(double valor) {
        this.saldo += valor;
    }

    public void efetuarSaque(double valorSaque) {
        this.saldo -= valorSaque;
        this.saldo -= TAXA;
    }

    @Override
    public String toString() {
        return "Conta Bancaria " + conta +
                ", Cliente: " + nome +
                ", Saldo: R$" + String.format("%.2f", saldo);
    }
}

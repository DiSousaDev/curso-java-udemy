package Aula121;

public class PessoaFisica extends ContaCorrente {

    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String numero, String titular, double saldo, String cpf) {
        super(numero, titular, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

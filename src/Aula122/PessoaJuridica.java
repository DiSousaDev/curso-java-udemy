package Aula122;

public class PessoaJuridica extends ContaCorrente {

    private String cnpj;
    private double chequeEspecial;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String numero, String titular, double saldo, String cnpj, double chequeEspecial) {
        super(numero, titular, saldo);
        this.cnpj = cnpj;
        this.chequeEspecial = chequeEspecial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public void efetuarEmprestimo(double valor){
        if(chequeEspecial >= valor){
            saldo += valor - 10.0;
        }else{
            System.out.println("Limite insuficiente para empréstimo.");
        }
    }
}

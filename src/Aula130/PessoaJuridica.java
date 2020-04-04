package Aula130;

public class PessoaJuridica extends Pessoa {

    private int numeroFuncionarios;

    public PessoaJuridica(){
    }
    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios){
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios(){
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios){
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcularImpostos(){
        if (numeroFuncionarios <= 10) {
            return (getRendaAnual() * 0.16);
        }else{
            return (getRendaAnual() * 0.14);
        }
    }
}

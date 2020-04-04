package Aula126;

public class FuncionarioTerceirizado extends Funcionario {

    private Double pagamentoAdicional;

    public FuncionarioTerceirizado(){

    }

    public FuncionarioTerceirizado(String nome, int horas, Double valorPorHora, Double pagamentoAdicional){
        super(nome, horas, valorPorHora);
        this.pagamentoAdicional = pagamentoAdicional;
    }

    public Double getPagamentoAdicional() {
        return pagamentoAdicional;
    }

    public void setPagamentoAdicional(Double pagamentoAdicional) {
        this.pagamentoAdicional = pagamentoAdicional;
    }

    public double calcularPagamento(){
        return super.calcularPagamento() + pagamentoAdicional * 1.1;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append(super.toString());
        string.append("\nPagamento Adicional: " + pagamentoAdicional);
        return string.toString();
    }
}

package Aula68;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double calcularSalarioLiquido(){
        double sal_liquido = salarioBruto - imposto;
        return sal_liquido;
    }
    public void aumentarSalario(double valor){
       salarioBruto += salarioBruto / 100 * valor;
    }

    @Override
    public String toString() {
        return nome + ", $ " + String.format("%.2f", calcularSalarioLiquido());
    }
}

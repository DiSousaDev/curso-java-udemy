package Aula141;


public class ContaCorrente {

    private int numero;
    private String cliente;
    private double saldoInicial;
    private double limiteSaque;

    public ContaCorrente(){
    }
    public ContaCorrente(int numero, String cliente, double saldoInicial, double limiteSaque){
        this.numero = numero;
        this.cliente = cliente;
        this.saldoInicial = saldoInicial;
        this.limiteSaque = limiteSaque;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public double getSaldoInicial(){
        return saldoInicial;
    }

    public double getLimiteSaque(){
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque){
        this.limiteSaque = limiteSaque;
    }
    public void efetuarSaque(double valor) throws DepositException{
        if(valor > saldoInicial && valor < limiteSaque){
            throw new DepositException("Saldo insuficiente");
        }if(valor < saldoInicial && valor > limiteSaque){
            throw new DepositException("O Valor excede o limite para saques.");
        }if(valor > saldoInicial || valor > limiteSaque){
            throw new DepositException("O Valor excede o limite para saques.");
        }else{
            saldoInicial-=valor;
        }
    }
    public void efetuarDeposito(double valor){
        saldoInicial+=valor;
    }
}

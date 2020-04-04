package Aula122;

import java.awt.image.BufferStrategy;

public class Teste {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("1234", "Diego Sousa", 0.0);
        PessoaJuridica contaJuridica1 = new PessoaJuridica("123456","Padaria Noanato",0.0,"05.881.460/0001-90",500.0);

        //UPCASTING
        ContaCorrente conta2 = contaJuridica1;
        ContaCorrente conta3 = new PessoaJuridica("123457", "Indústria Brasileira", 0.0, "04.3128.204/0001-26", 500.00);
        ContaCorrente conta4 = new PoupancaFisica("1111", "Roberto Justus", 0.0, 0.2, "057.343.556-99");

        //DOWNCASTING
        PessoaJuridica conta5 = (PessoaJuridica)conta3;
        conta5.efetuarEmprestimo(100.0);

        if(conta4 instanceof PessoaJuridica){
            PessoaJuridica conta6 = (PessoaJuridica)conta4;
            conta6.efetuarEmprestimo(200.0);
            System.out.println("Empréstimo");
        }
        if(conta4 instanceof PoupancaFisica){
            PoupancaFisica conta6 = (PoupancaFisica) conta4;
            conta6.atualizarSaldo();
            System.out.println("Atualizar Taxas");
        }

    }
}

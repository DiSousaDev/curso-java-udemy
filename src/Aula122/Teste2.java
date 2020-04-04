package Aula122;

public class Teste2 {
    public static void main(String[] args) {

        ContaCorrente conta1 = new PoupancaFisica("1234","Diego Sousa", 500.00, 0.5, "054.962.809-66");

        conta1.efetuarSaque(100);

        System.out.println(conta1.saldo);

    }
}

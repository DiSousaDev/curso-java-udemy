package Aula70;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor do raio:");
        double raio = scan.nextDouble();

        double c = Calculadora.circunferencia(raio);

        double v = Calculadora.volume(raio);

        System.out.printf("Circunferência: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",Calculadora.PI);

        scan.close();
    }


}

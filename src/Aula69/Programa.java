package Aula69;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Insira o valor do raio:");
        double raio = scan.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferência: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",calc.PI);

        scan.close();
    }


}

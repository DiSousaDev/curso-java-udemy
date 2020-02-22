package Aula68;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a base do triangulo:");
        retangulo.base = scan.nextDouble();

        System.out.println("Digite a altura do triangulo:");
        retangulo.altura = scan.nextDouble();

        retangulo.calcularDiagonal();
        retangulo.calcularPerimetro();
        retangulo.calcularArea();

        System.out.println(retangulo);

    }
}

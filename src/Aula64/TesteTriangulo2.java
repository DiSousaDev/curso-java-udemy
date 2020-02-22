package Aula64;

import java.util.Scanner;

public class TesteTriangulo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Insira as medidas do tringulo X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Insira as medidas do tringulo Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();



    }

}

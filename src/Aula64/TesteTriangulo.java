package Aula64;

import java.util.Scanner;

public class TesteTriangulo {
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

        double p = (x.a * x.b * x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * ( p - x.b) * ( p - x.c));

        p = (y.a * y.b * y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * ( p - y.b) * ( p - y.c));

        System.out.printf("Área do triangulo X: %.4f%n",areaX);
        System.out.printf("Área do triangulo Y: %.4f%n",areaY);


        if(areaX > areaY){
            System.out.println("Maior área: Área X");
        }else{
            System.out.println("Maior área: Área Y");
        }

    }

}

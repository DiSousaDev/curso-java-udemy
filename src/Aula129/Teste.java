package Aula129;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<FiguraGeometrica> figuras = new ArrayList<>();

        System.out.print("Entre com a quantidade de figuras:");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Figura #" + i);
            System.out.print("Retangulo ou Circulo (r/c)?");
            int f = scan.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO):");
            Cor cor = Cor.valueOf(scan.next());
            if (f == 'r') {
                System.out.print("Base:");
                double base = scan.nextDouble();
                System.out.print("Altura:");
                double altura = scan.nextDouble();
                figuras.add(new Retangulo(cor, base, altura));
            }else if(f == 'c'){
                System.out.print("Raio:");
                double raio = scan.nextDouble();
                figuras.add(new Circulo(cor, raio));
            }else{
                System.out.println("Valor inválido");
            }
        }

        System.out.println("AREA DAS FIGURAS");
        for(FiguraGeometrica figura : figuras){
            System.out.println(String.format("%.2f",figura.area()));
        }
        scan.close();
    }
}

package Aula181;

import java.io.File;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta:");
        String strPatch = scan.nextLine();

        File path = new File(strPatch);

        File[] pastas = path.listFiles(File::isDirectory);
        System.out.println("Pastas");
        for(File pasta : pastas){
            System.out.println(pasta);
        }
        System.out.println("Arquivos");
        File[] arquivos = path.listFiles(File::isFile);
        for(File arquivo : arquivos){
            System.out.println(arquivo);
        }

    scan.close();
    }
}

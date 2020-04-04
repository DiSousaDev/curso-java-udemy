package Aula177;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        File file = new File("D:\\Workspace-IntelliJ IDEA\\curdo-java-udemy\\in.txt");
        Scanner scan = null;

        try{
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            if(scan != null) {
                scan.close();
            }
        }
    }
}

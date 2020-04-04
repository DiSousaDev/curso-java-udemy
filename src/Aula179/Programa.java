package Aula179;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

    public static void main(String[] args){

        String path = "D:\\Workspace-IntelliJ IDEA\\curdo-java-udemy\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Erro: Arquivo -> " + e.getMessage());
        }
    }
}


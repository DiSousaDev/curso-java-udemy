package Aula180;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {
    public static void main(String[] args){

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa Noite"};

        String path = "D:\\Workspace-IntelliJ IDEA\\curdo-java-udemy\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
        }

    }
}

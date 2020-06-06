package Aula206;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args){

        Set<User> users = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("aula206.txt"))){

            String linha = br.readLine();
            while(linha != null){
                String[] fields = linha.split(" ");
                User user = new User(fields[0], Instant.parse(fields[1]));
                users.add(user);
                linha = br.readLine();
            }

            System.out.println("Total users: " + users.size());

        }catch (IOException erro){
            System.out.println("Erro: " + erro);
        }

    }
}

package Aula209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args){

        Map<String, Integer> votos = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("aula209.txt"))){

           String linha = br.readLine();

            while(linha != null){
                String[] coluna = linha.split(",");
                String nome = coluna[0];
                int voto = Integer.parseInt(coluna[1]);

                if(votos.containsKey(nome)){
                    int contarVotos = votos.get(nome);
                    votos.put(nome, contarVotos+voto);
                }else{
                    votos.put(nome,voto);
                }
                linha = br.readLine();
            }

            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }



    }

}

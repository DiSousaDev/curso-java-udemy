package Aula93;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Fernando");
        list.add("Alex");
        list.add("Anderson");
        list.add("Amadeu");
        list.add("Bob");
        list.add("Ana");
        list.add("Carlos");
        list.add(2, "Marco");


        int tamanhoDaLista = list.size();

        for (String x : list) {
            System.out.println(x);
        }
        System.out.printf("Tamanho da Lista: %d\n\n", tamanhoDaLista);

        System.out.println("----- Revomendo itens --------");

        list.remove("Ana");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----- Localizando um iten --------");
        System.out.println("Index of de Bob: " + list.indexOf("Bob"));
        System.out.println("Index of de Mario (Não existe): " + list.indexOf("Mario"));


        System.out.println("----- Mantendo um iten --------");
        //exibe somente itens começando com A
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("----- Buscando um iten --------");
        //encontra o primeiro elemento com a letra A, caso nao encontre retorna null
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    }
}



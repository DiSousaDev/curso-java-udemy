package Aula117;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Teste {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comentario1 = new Comentario("Have a Nice Trip!");
        Comentario comentario2 = new Comentario("Wow that's awesome!");

        Date momento = sdf.parse("21/06/2018 13:05:44");
        String titulo = "Traveling to New Zealand";
        String conteudo = "I'm going to visit this wonderful country!";
        int likes = 12;

        Post post1 = new Post(momento,titulo,conteudo,likes);

        post1.adicionarComentario(comentario1);
        post1.adicionarComentario(comentario2);

        System.out.println(post1);
    }
}

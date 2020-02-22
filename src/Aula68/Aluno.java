package Aula68;

import java.sql.SQLOutput;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia(){
        double media = (nota1+nota2+nota3)/3;
        return media;
    }

    public boolean verificaAprovado(){
        if(calcularMedia() >= 60){
            System.out.println("Aprovado!");
            return true;
        }else{
            System.out.println("Reprovado!\n Faltou " + (calcularMedia() - 60) + " pontos." );
            return false;
        }
    }
}

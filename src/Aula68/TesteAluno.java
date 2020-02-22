package Aula68;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Diego Sousa";
        aluno.nota1 = 27;
        aluno.nota2 = 31;
        aluno.nota3 = 32;

        aluno.calcularMedia();
        aluno.verificaAprovado();

    }
}

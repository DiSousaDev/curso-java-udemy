package Aula206;

import java.time.Instant;
import java.util.Objects;

public class User{

    private String nome;
    private Instant acesso;

    public User(String nome, Instant acesso){
        this.nome = nome;
        this.acesso = acesso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Instant getAcesso(){
        return acesso;
    }

    public void setAcesso(Instant acesso){
        this.acesso = acesso;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(nome, user.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }

    @Override
    public String toString(){
        return "User{" + "Nome= '" + nome + '\'' + ", acesso=" + acesso + '}';
    }
}

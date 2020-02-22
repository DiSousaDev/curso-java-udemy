package Aula91;

public class ForEach {
    public static void main(String[] args) {

        String[] nomes = new String[] {"Maria", "Bob", "Alex"};

        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
        for(String obj : nomes){
            System.out.println(obj);
        }


    }
}

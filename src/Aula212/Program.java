package Aula212;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV",900.00));
        products.add(new Product("Notebook",1200.00));
        products.add(new Product("Tablet",450.00));

        products.sort((prod1,prod2) -> prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase()));

        for(Product product : products){
            System.out.println(product);
        }
    }
}

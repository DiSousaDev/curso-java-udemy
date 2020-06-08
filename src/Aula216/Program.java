package Aula216;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV",900.00));
        products.add(new Product("Notebook",1200.00));
        products.add(new Product("Mouse",50.00));
        products.add(new Product("Tablet",450.00));
        products.add(new Product("HD Case",80.90));

        Double fator = 1.1;

        products.forEach(p -> p.setPrice(p.getPrice() * fator));

        products.forEach(System.out::println);

    }
}

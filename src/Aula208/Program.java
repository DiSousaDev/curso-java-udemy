package Aula208;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args){

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "4198756464");

        cookies.remove("email");
        cookies.put("phone", "1122344");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Contains 'phone number': " + cookies.get("phone"));
        System.out.println("Contains 'email': " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All Cookies");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }

}

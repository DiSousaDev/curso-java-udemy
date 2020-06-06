package Aula207;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();


        System.out.print("How many students for course A?");
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            courseA.add(scan.nextInt());
        }
        System.out.print("How many students for course B?");
        n = scan.nextInt();
        for(int i=0; i<n; i++){
            courseB.add(scan.nextInt());
        }
        System.out.print("How many students for course C?");
        n = scan.nextInt();
        for(int i=0; i<n; i++){
            courseC.add(scan.nextInt());
        }

        Set<Integer> total = new HashSet<>(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        scan.close();

    }
}

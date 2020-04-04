package Aula137;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Numero do quarto:");
            int numero = scan.nextInt();

            System.out.println("Data de check-in:");
            Date checkin = sdf.parse(scan.next());
            System.out.println("Data de check-out:");
            Date checkout = sdf.parse(scan.next());

            Reserva reserva = new Reserva(numero, checkin, checkout);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira os dados para atualizar a reserva:");
            System.out.println("Data de check-in:");
            checkin = sdf.parse(scan.next());
            System.out.println("Data de check-out:");
            checkout = sdf.parse(scan.next());

            reserva.atualizarDatas(checkin, checkout);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Data inválida.");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado.");
        }

        scan.close();
    }
}

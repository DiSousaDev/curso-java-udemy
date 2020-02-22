package Aula100;

import java.nio.channels.CancelledKeyException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataCalendar {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);

        d=cal.getTime();

        System.out.println(sdf.format(d));

        System.out.println("--------------------------------------");
        int mes = cal.get(Calendar.MONTH) + 1;
        int minutos = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        System.out.println("Mes :" + mes);
        System.out.println("Minutos :" + minutos);
        System.out.println("Segundos :" + segundos);
    }
}

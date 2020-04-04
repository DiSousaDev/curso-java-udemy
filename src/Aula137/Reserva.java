package Aula137;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private int numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(){
    }

    public Reserva(int numeroQuarto, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out não pode ser antes do Check-in.");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getNumeroQuarto(){
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckin(){
        return checkIn;
    }

    public Date getCheckout(){
        return checkOut;
    }

    public long duracao(){
        long dif = checkOut.getTime() - checkIn.getTime(); //diferenca das duas datas em millisegundos
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("as datas para atualização não podem ser anteriores a data atual.");
        }
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out não pode ser antes do Check-in.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){

        return "Quarto " + numeroQuarto + ", checkIn= " + sdf.format(checkIn) + ", checkOut= " + sdf.format(checkOut) + ", " + duracao() + " noites";
    }
}


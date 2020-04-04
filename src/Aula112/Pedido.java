package Aula112;

import java.util.Date;

public class Pedido {
    private int id;
    private Date momento;
    private StatusCompra status;

    public Pedido() {}

    public Pedido(int id, Date momento, StatusCompra status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Pedido(int id, String format, StatusCompra aguardandoPagamento) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusCompra getStatus() {
        return status;
    }

    public void setStatus(StatusCompra status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido de venda {" +
                "id: " + id +
                ", Data do pedido: " + momento +
                ", Status: " + status +
                '}';
    }
}

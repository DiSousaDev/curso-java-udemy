package Aula118;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date momento;
    private StatusPedido status;

    private Cliente cliente;
    private List<ItemPedido> itensPedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void adicionarItem(ItemPedido itempedido) {
        itensPedidos.add(itempedido);
    }

    public void removerItem(ItemPedido itempedido) {
        itensPedidos.remove(itempedido);
    }

    public double total() {
        double total = 0;
        for (ItemPedido i : itensPedidos) {
            total += i.subTotal();
        }
        return total;
    }

    @Override
    public String   toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento da Compra: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status da Compra: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do Pedido:\n");
        for (ItemPedido i : itensPedidos) {
            sb.append(i + "\n");
        }
        sb.append("Valor Total: R$");
        sb.append(String.format("%.2f",total()));
        return sb.toString();
    }
}

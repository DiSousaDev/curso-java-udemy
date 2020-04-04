package Aula112;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestePedido {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1080, new Date(), StatusCompra.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido1);

        StatusCompra os1 = StatusCompra.ENTREGUE;
        StatusCompra os2 = StatusCompra.valueOf("ENTREGUE");

        System.out.println(os1 + "\n" + os2);
    }
}

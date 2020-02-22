package Aula71;

public class Dollar {

    public static double IOF = 0.06;

    public static double conversaoAtual(double valor, double quant){
        return  valor * quant * (1.0 + IOF);
    }

}

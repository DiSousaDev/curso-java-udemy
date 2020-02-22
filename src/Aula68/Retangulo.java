package Aula68;

public class Retangulo {

    public double altura;
    public double base;

    public double calcularArea(){
        double area = altura * base;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = 2 * (altura + base);
        return perimetro;
    }
    public double calcularDiagonal(){
        double diagonal = Math.sqrt((base*base)+(altura*altura));
        return diagonal;
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", calcularArea()) +
                "\nPERIMETRO = " + String.format("%.2f", calcularPerimetro()) +
                "\nDIAGONAL = " + String.format("%.2f", calcularDiagonal()) ;
    }
}

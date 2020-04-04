package Aula126;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Teste {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Funcionario> funcionarios = new ArrayList<>();

        int qtdFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de funcionários."));

        for(int i=0; i<qtdFuncionarios; i++){
            JOptionPane.showMessageDialog(null, "Funcionário #" +(i+1)+ " dados:" );
            char terceirizado = JOptionPane.showInputDialog("Terceirizado? s/n").charAt(0);

            String nome = JOptionPane.showInputDialog("Nome:");
            int hora = Integer.parseInt(JOptionPane.showInputDialog("Horas:"));
            double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por Hora:"));

            if(terceirizado == 's') {
                double adicional = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional:"));
                funcionarios.add(new FuncionarioTerceirizado(nome,hora,valorHora,adicional));
            }else{
                funcionarios.add(new Funcionario(nome,hora,valorHora));
            }
        }
        System.out.println("PAGAMENTOS:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - $ " + String.format("%.2f",f.calcularPagamento()));
        }

    }

}


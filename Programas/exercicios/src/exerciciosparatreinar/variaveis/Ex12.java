package exerciciosparatreinar.variaveis;

/*
Elaborar um programa que realize a conversão de R$ para US$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a cotação do Dólar: US$ ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite o valor em Real: R$ ");
        double real = scanner.nextDouble();
        double realParaDolar = real / cotacaoDolar;

        String realParaDolarFormat = format.format(realParaDolar);
        System.out.println("Valor em Dólar: US$ " + realParaDolarFormat);
    }
}

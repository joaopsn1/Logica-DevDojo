package exerciciosparatreinar.variaveis;

/*
Elaborar um programa que realize a conversão de US$ para R$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a cotação atual do Dólar: US$ ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite o valor em Dolar para a conversão em Real: US$ ");
        double dolar = scanner.nextDouble();
        double conversaoParaReal = dolar * cotacaoDolar;

        String conversaoParaRealFormat = format.format(conversaoParaReal);
        System.out.println("Valor em Real: R$ " + conversaoParaRealFormat);
    }
}

package exerciciosparatreinar.variaveis;

/*
Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:

P=VALOR + (VALOR * (TAXA/100)*TEMPO)

Onde P é o valor da prestação em atraso.

 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite o valor da prestação: R$ ");
        double valor = scanner.nextDouble();
        double taxa = 5;
        System.out.print("Digite o tempo de atraso em dias: ");
        int tempo = scanner.nextInt();
        double prestacaoAtraso = valor + (valor * (taxa / 100) * tempo);

        String prestacaoAtrasoFormatado = format.format(prestacaoAtraso);
        System.out.println("Valor da prestação em atraso: R$ " + prestacaoAtrasoFormatado);
    }

}

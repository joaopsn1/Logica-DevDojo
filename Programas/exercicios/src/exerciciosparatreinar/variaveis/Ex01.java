package exerciciosparatreinar.variaveis;

/*
Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

A = piR²

Onde:
 	A representa a área do círculo
  	pi = 3.141592654
	R = Raio do círculo (deve ser fornecido pelo usuário)
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatacao = new DecimalFormat("0.00");

        double pi = Math.PI;
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = pi * Math.pow(raio, 2);

        String areaFormatada = formatacao.format(area);
        System.out.println("Área do Círculo: " + areaFormatada);
    }
}

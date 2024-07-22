package exerciciosparatreinar.variaveis;

/*
Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = (9 * C) / 5
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatacao = new DecimalFormat("0.00");

        System.out.print("Digite a temperatura em graus °C: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFarenheit = (9 * temperaturaCelsius) / 5;

        String tempFarenheitFormatado = formatacao.format(temperaturaFarenheit);
        System.out.println("Temperatura em Farenheit: " + tempFarenheitFormatado + " °F");
    }
}

package exerciciosparatreinar.variaveis;

/*
Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C). Utilize a fórmula abaixo:

C = (( F - 32) * 5) / 9
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a temperatura em °F: ");
        double tempFarenheit = scanner.nextDouble();
        double tempCelsius = ((tempFarenheit - 32) * 5) / 9;

        String celsiusFormatado = format.format(tempCelsius);
        System.out.println("Temperatura em Celsius: " + celsiusFormatado + " °C");
    }
}

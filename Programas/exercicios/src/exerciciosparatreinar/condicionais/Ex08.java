package exerciciosparatreinar.condicionais;

/*
Desenvolva uma calculadora de IMC (Índice de Massa Corporal), após realizado o cálculo classificar o paciente de acordo com a tabela abaixo.

		Para realizar o cálculo de IMC utilize a fórmula abaixo:

		IMC=PESO/ALTURA²
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("%.1f\n", imc);

        if (imc < 10.0) {
            System.out.println("Desnutrição Grau V");
        } else if (imc >= 10.0 && imc <= 12.99) {
            System.out.println("Desnutrição Grau IV");
        } else if (imc >= 13.0 && imc <= 15.99) {
            System.out.println("Desnutrição Grau III");
        } else if (imc >= 16.0 && imc <= 16.99) {
            System.out.println("Desnutrição Grau II");
        } else if (imc >= 17.0 && imc <= 18.49) {
            System.out.println("Desnutrição Grau I");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Normal");
        } else if (imc >= 25.0 && imc <= 29.99) {
            System.out.println("Pré-Obesidade");
        } else if (imc >= 30.0 && imc <= 34.99) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.99) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }
    }
}

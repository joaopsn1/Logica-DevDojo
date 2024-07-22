package exerciciosparatreinar.variaveis;

/*
Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado, ao cubo e a 10, apresentar também a soma total dos três resultados anteriores.
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int numeroQuadrado = (int) Math.pow(numero, 2);
        int numeroCubo = (int) Math.pow(numero, 3);
        int numeroDecimaPotencia = (int) Math.pow(numero, 10);
        int soma = numeroQuadrado + numeroCubo + numeroDecimaPotencia;
        System.out.println("Valor ao quadrado: " + numeroQuadrado);
        System.out.println("Valor ao cubo: " + numeroCubo);
        System.out.println("Valor a decima potência: " + numeroDecimaPotencia);
        System.out.println("Soma dos valores: " + soma);
    }
}

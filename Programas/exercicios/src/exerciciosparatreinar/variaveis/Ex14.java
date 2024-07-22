package exerciciosparatreinar.variaveis;

/*
Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o resultado das quatro operações aritméticas básicas (adicao, subtracao, multiplicacao e divisao).
 */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        System.out.println("Adição Numero 1 + Numero 2: " + soma);
        System.out.println("Subtração Numero 1 - Numero 2: " + subtracao);
        System.out.println("Multiplicação Numero 1 x Numero 2: " + multiplicacao);
        System.out.println("Divisão Numero 1  Numero 2: " + divisao);
    }
}

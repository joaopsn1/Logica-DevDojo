package exerciciosparatreinar.lacosderepeticao;

/*
Desenvolva um programa que dado um número inteiro apresente as tabuadas do 1 ao 10 desse número.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para apresentar sua tabuada: ");
        int valorTabuada = scanner.nextInt();
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = valorTabuada * i;
            System.out.println(valorTabuada + " x " + i + " = " + resultado);
        }
    }
}

package exerciciosparatreinar.lacosderepeticao;

/*
Elaborar um programa que calcule e apresente a tabuada de um número qualquer.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para obter a tabuada: ");
        int numeroTabuada = scanner.nextInt();
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = i * numeroTabuada;
            System.out.println(i + " x " + numeroTabuada + " = " + resultado);
        }
    }
}

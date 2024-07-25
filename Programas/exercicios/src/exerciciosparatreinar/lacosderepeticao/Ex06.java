package exerciciosparatreinar.lacosderepeticao;

/*
Elaborar um programa que calcule o fatorial de um número inteiro
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero para o fatorial: ");
        int numeroFatorial = scanner.nextInt();
        int resultado = 1;
        if (numeroFatorial == 0) {
            System.out.println(numeroFatorial + "! = " + resultado);
        } else if (numeroFatorial == 1) {
            System.out.println(numeroFatorial + "! = " + resultado);
        } else {
            for (int i = numeroFatorial; i > 1; i--) {
                resultado *= i;
            }
            System.out.println(numeroFatorial + "! = " + resultado);
        }
    }
}

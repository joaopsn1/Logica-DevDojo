package exerciciosparatreinar.variaveis;

/*
Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor e seu sucessor.
 */

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("Sucessor de " + numero + " é: " + sucessor);
        System.out.println("Antecessor de " + numero + " é: " + antecessor);
    }
}

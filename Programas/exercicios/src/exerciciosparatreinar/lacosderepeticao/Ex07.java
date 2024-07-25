package exerciciosparatreinar.lacosderepeticao;

/*
Melhorar o Ex06 fazendo com que leia 5 números inteiros e calcule o fatorial dos 5 valores lidos.
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1° Valor para o fatorial: ");
        int fatorial1 = scanner.nextInt();
        System.out.print("Digite o 2° Valor para o fatorial: ");
        int fatorial2 = scanner.nextInt();
        System.out.print("Digite o 3° Valor para o fatorial: ");
        int fatorial3 = scanner.nextInt();
        System.out.print("Digite o 4° Valor para o fatorial: ");
        int fatorial4 = scanner.nextInt();
        System.out.print("Digite o 5° Valor para o fatorial: ");
        int fatorial5 = scanner.nextInt();
        int resultado1 = 1;
        int resultado2 = 1;
        int resultado3 = 1;
        int resultado4 = 1;
        int resultado5 = 1;

        if (fatorial1 == 0) {
            System.out.println(fatorial1 + "! = " + resultado1);
        } else {
            for (int i = fatorial1; i > 1; i--) {
                resultado1 *= i;
            }
            System.out.println("1° Fatorial - " + fatorial1 + "! = " + resultado1);
        }

        if (fatorial2 == 0) {
            System.out.println(fatorial2 + "! = " + resultado2);
        } else {
            for (int i = fatorial2; i > 1; i--) {
                resultado2 *= i;
            }
            System.out.println("2° Fatorial - " + fatorial2 + "! = " + resultado2);
        }

        if (fatorial3 == 0) {
            System.out.println(fatorial3 + "! = " + resultado3);
        } else {
            for (int i = fatorial3; i > 1; i--) {
                resultado3 *= i;
            }
            System.out.println("3° Fatorial - " + fatorial3 + "! = " + resultado3);
        }

        if (fatorial4 == 0) {
            System.out.println(fatorial4 + "! = " + resultado4);
        } else {
            for (int i = fatorial4; i > 1; i--) {
                resultado4 *= i;
            }
            System.out.println("4° Fatorial - " + fatorial4 + "! = " + resultado4);
        }

        if (fatorial5 == 0) {
            System.out.println(fatorial5 + "! = " + resultado5);
        } else {
            for (int i = fatorial5; i > 1; i--) {
                resultado5 *= i;
            }
            System.out.println("5° Fatorial - " + fatorial5 + "! = " + resultado5);
        }
    }
}

package arrays.multidimensional.aula42;

/*
Calcular a multiplicação da diagonal principal de uma matriz quadrada
 */

import java.util.Scanner;

public class MultiplicacaoDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrayQuadrado = new int[3][3];
        int multiplicacaoDiagonalArray = 1;
        for (int i = 0; i < arrayQuadrado.length; i++) {
            for (int j = 0; j < arrayQuadrado[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "] = ");
                arrayQuadrado[i][j] = scanner.nextInt();
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Imprimindo valores");
        for (int i = 0; i < arrayQuadrado.length; i++) {
            for (int j = 0; j < arrayQuadrado[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arrayQuadrado[i][j]);
                if (i == j) {
                    multiplicacaoDiagonalArray = multiplicacaoDiagonalArray * arrayQuadrado[i][j];
                }
            }
        }
        System.out.println("--------------------------------");
        System.out.print("Multiplicação da diagonal principal: " + multiplicacaoDiagonalArray);
    }

}

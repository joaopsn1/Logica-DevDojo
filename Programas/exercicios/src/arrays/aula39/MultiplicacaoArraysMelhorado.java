package arrays.aula39;

/*
Armazenar em dois vetores V1 e V2 9 valores numéricos inteiros e exibir o resultado da multiplicação dos números do V1 com os correspondentes em V2.
 */

import java.util.Scanner;

public class MultiplicacaoArraysMelhorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];
        String resultadoMultiplicacaoArrays = "";
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor 1, posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
            System.out.print("Vetor 2, posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
            vetor3[i] = vetor1[i] * vetor2[i];
            resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays + vetor3[i] + " ";
        }
        System.out.println(resultadoMultiplicacaoArrays);
    }
}

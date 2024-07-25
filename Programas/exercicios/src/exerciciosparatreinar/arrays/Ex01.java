package exerciciosparatreinar.arrays;

/*
Armazenar em dois vetores V1 e V2 9 valores numéricos inteiros e exibir o resultado da multiplicação dos números do V1 com os correspondentes em V2
	Exemplo:

V1  1   2   3   4   5   6   7   8   9
V2  2   3   4   5   6   7   8   9   0
VR  2   6   12  20  30  42  56  72  0
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        String resultadoMultiplicacaoArrays = "";

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite a " + (i + 1) + "° posição do 1° array: ");
            array1[i] = scanner.nextInt();
            System.out.print("Digite a " + (i + 1) + "° posição do 2° array: ");
            array2[i] = scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays + array3[i] + " ";
            }
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
        System.out.println(resultadoMultiplicacaoArrays);
    }
}

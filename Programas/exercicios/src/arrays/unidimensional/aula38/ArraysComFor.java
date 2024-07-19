package arrays.unidimensional.aula38;

import java.util.Scanner;

public class ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            media += notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            System.out.println("-------------");
        }
        media = media/ notas.length;
        System.out.println("Media das notas: " + media);
    }
}

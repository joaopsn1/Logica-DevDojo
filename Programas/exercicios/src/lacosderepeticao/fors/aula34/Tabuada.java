package lacosderepeticao.fors.aula34;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroTabuada = scanner.nextInt();
        System.out.println("Tabuada do " + numeroTabuada);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + numeroTabuada * i);
        }
    }
}

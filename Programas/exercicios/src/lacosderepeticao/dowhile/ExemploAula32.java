package lacosderepeticao.dowhile;

import java.util.Scanner;

public class ExemploAula32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desejaContinuar = 1;
        do {
            System.out.print("PLAYER 1 - Digite um número de 1 a 10: ");
            int num1 = scanner.nextInt();
            System.out.print("PLAYER 2 - Digite um número de 1 a 10: ");
            int num2 = scanner.nextInt();
            System.out.println("Acertou? " + (num1 == num2));
            System.out.println("Deseja Continuar Jogando?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = scanner.nextInt();
        } while (desejaContinuar == 1);
    }

}

package lacosderepeticao.whiles.aula29;

/*
Eu como usuario gostaria de imprimir todos os valores ímpares de 0 até o valor digitado pelo usuário.
 */

import java.util.Scanner;

public class RepeticaoImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.print("Digite o valor máximo desejado: ");
        int numeroMaximo = scanner.nextInt();
        System.out.println("Ímpares: ");
        while (contador <= numeroMaximo) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}

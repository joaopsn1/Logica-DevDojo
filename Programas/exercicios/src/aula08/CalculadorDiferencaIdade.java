package aula08;

/*
Crie uma variável para guardar a primeira idade;
Crie uma variável para guardar a segunda idade;
Crie uma variável para guardar a diferença entre a primeira e a segunda idade;
Imprima a diferença no console.
 */

import java.util.Scanner;

public class CalculadorDiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiraIdade = scanner.nextInt();
        int segundaIdade = scanner.nextInt();
        int diferencaIdade = primeiraIdade - segundaIdade;
        if (diferencaIdade < 0) {
            diferencaIdade *= -1;
        }
        System.out.println("A diferença da idade é: " + diferencaIdade);
    }
}

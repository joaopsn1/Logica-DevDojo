package exerciciosparatreinar.condicionais;

/*
Leia um número inteiro qualquer  e multiplique por 2, apresentar o resultado da multiplicação  somente se o resultado for maior ou igual a 30.
 */

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 30;

        int numero = random.nextInt(upperbound);
        System.out.println("Número aleatório: " + numero);
        int maiorIgualTrinta = 2 * numero;

        if (maiorIgualTrinta >= 30) {
            System.out.println("Valor multiplicado: " + maiorIgualTrinta);
        }
    }
}

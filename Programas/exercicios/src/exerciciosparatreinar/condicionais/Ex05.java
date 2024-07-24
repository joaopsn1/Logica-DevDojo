package exerciciosparatreinar.condicionais;

/*
Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o valor esteja entre 1 e 9 apresentar a mensagem “Dentro do valor permitido”e caso contrário apresentar a mensagem  “Fora do Valor Permitido”.
 */

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 20;

        int numero = random.nextInt(upperbound);
        System.out.println(numero);

        if (numero >= 1 && numero <= 9) {
            System.out.println("DENTRO DO VALOR!");
        } else {
            System.out.println("FORA DO VALOR PERMITIDO!");
        }
    }
}

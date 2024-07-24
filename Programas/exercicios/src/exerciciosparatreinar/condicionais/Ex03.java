package exerciciosparatreinar.condicionais;

/*
Desenvolva a leitura de cinco valores numéricos inteiros e apresente somente os que forem divisíveis por 2 ou por 3.
 */

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 100;

        int number1 = random.nextInt(upperbound);
        int number2 = random.nextInt(upperbound);
        int number3 = random.nextInt(upperbound);
        int number4 = random.nextInt(upperbound);
        int number5 = random.nextInt(upperbound);

        System.out.println(number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);

        System.out.println("IMPRIMINDO DIVISEIS POR 2 E 3");

        if (number1 % 2 == 0 || number1 % 3 == 0) {
            System.out.println(number1);
        }
        if (number2 % 2 == 0 || number2 % 3 == 0) {
            System.out.println(number2);
        }
        if (number3 % 2 == 0 || number3 % 3 == 0) {
            System.out.println(number3);
        }
        if (number4 % 2 == 0 || number4 % 3 == 0) {
            System.out.println(number4);
        }
        if (number5 % 2 == 0 || number5 % 3 == 0) {
            System.out.println(number5);
        }
    }
}

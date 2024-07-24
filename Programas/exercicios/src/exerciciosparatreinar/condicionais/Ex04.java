package exerciciosparatreinar.condicionais;

/*
Escreva um programa que dados cinco valores numéricos inteiros apresente apenas o maior e o menor deles.
 */

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 100;

        int number1 = random.nextInt(upperbound);
        int number2 = random.nextInt(upperbound);
        int number3 = random.nextInt(upperbound);
        int number4 = random.nextInt(upperbound);
        int number5 = random.nextInt(upperbound);
        System.out.println(number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);

        System.out.println("IMPRIMINDO MAIOR VALOR");
        if (number1 > number2) {
            if (number1 > number3) {
                if (number1 > number4) {
                    System.out.println(Math.max(number1, number5));
                } else {
                    System.out.println(Math.max(number4, number5));
                }
            } else if (number3 > number4) {
                System.out.println(Math.max(number3, number5));
            } else {
                System.out.println(Math.max(number4, number5));
            }
        } else if (number2 > number3) {
            if (number2 > number4) {
                System.out.println(Math.max(number2, number5));
            } else {
                System.out.println(Math.max(number4, number5));
            }
        } else if (number3 > number4) {
            System.out.println(Math.max(number3, number5));
        } else {
            System.out.println(Math.max(number4, number5));
        }

        System.out.println("IMPRIMINDO MENOR VALOR");
        if (number1 < number2) {
            if (number1 < number3) {
                if (number1 < number4) {
                    System.out.println(Math.min(number1, number5));
                } else {
                    System.out.println(Math.min(number4, number5));
                }
            } else if (number3 < number4) {
                System.out.println(Math.min(number3, number5));
            } else {
                System.out.println(Math.min(number4, number5));
            }
        } else if (number2 < number3) {
            if (number2 < number4) {
                System.out.println(Math.min(number2, number5));
            } else {
                System.out.println(Math.min(number4, number5));
            }
        } else if (number3 < number4) {
            System.out.println(Math.min(number3, number5));
        } else {
            System.out.println(Math.min(number4, number5));
        }
    }
}

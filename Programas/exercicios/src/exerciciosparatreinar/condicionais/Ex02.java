package exerciciosparatreinar.condicionais;

/*
Desenvolva uma rotina que dados três números inteiros, apresente-os em ordem crescente
 */

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 100;

        int numero1 = random.nextInt(upperbound);
        int numero2 = random.nextInt(upperbound);
        int numero3 = random.nextInt(upperbound);

        System.out.println(numero1 + ", " + numero2 + ", " + numero3);
        System.out.println("");
        System.out.println("ORDENANDO");
        int aux = numero2;
        int aux2 = numero3;
        if (numero1 > numero2) {
            numero2 = numero1;
            numero1 = aux;
            if (numero2 > numero3) {
                numero3 = numero2;
                numero2 = aux2;
                if (numero1 > numero2) {
                    numero2 = numero1;
                    numero1 = aux2;
                }
            }
        } else if (numero2 > numero3) {
            numero3 = numero2;
            numero2 = aux2;
            if (numero1 > numero2) {
                numero2 = numero1;
                numero1 = aux2;
            }
        }
        System.out.println(numero1 + ", " + numero2 + ", " + numero3);
    }
}

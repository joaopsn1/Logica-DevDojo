package exerciciosparatreinar.lacosderepeticao;

/*
Elaborar um programa que apresente os quadrados dos números inteiros existentes na faixa de valores de 15 até 200.
 */

public class Ex01 {
    public static void main(String[] args) {
        int quadrado = 0;
        for (int i = 15; i <= 200; i++) {
            quadrado = (int) Math.pow(i, 2);
            System.out.println(i + "² = " + quadrado);
        }
    }
}

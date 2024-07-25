package exerciciosparatreinar.lacosderepeticao;

/*
Elaborar um programa que apresente a sequência de Fibonacci até o décimo quinto termo.
 */

public class Ex05 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Fim");
    }
}

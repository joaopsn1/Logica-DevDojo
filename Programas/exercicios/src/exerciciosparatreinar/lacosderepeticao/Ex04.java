package exerciciosparatreinar.lacosderepeticao;

/*
Elaborar uma rotina que apresente todos os números pares na faixa de 0 até 100.
 */

public class Ex04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

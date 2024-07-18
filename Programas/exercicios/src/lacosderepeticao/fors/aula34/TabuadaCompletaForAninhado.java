package lacosderepeticao.fors.aula34;

/*
Elaborar um programa que calcule e apresente a tabuada de um número qualquer
 */

public class TabuadaCompletaForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("---------------");
        }
    }
}

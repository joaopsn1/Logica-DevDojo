package exerciciosparatreinar.variaveis;

/*
B) Em um circuito elétrico temos as seguintes informações:
275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:

U=R*I

Onde:
	U = Tensão em Volts
	R = Resistência em Ohms
	I = Corrente em Amperes

BÔNUS: Altere o programa acima e permita que o usuário digite os valores
	para Ohms  e Amperes.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a Resistência (Ω): ");
        double resistencia = scanner.nextDouble();
        System.out.print("Digite a Corrente (A): ");
        double corrente = scanner.nextDouble();
        double tensao = resistencia * corrente;

        String tensaoFormatada = format.format(tensao);
        System.out.println("Tensão: " + tensaoFormatada + " V");
    }
}

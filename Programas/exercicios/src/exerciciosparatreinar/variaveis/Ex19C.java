package exerciciosparatreinar.variaveis;

/*
C) Em um circuito elétrico temos as seguintes informações:
12 V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:


I=U/R

Onde:
	I = Corrente em Amperes
	U = Tensão em Volts
	R = Resistência em Ohms


BÔNUS: Altere o programa acima e permita que o usuário digite os valores
	para Volts  e Ohms.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a Tensão (V): ");
        double tensao = scanner.nextDouble();
        System.out.print("Digite a Resistência (Ω): ");
        double resistencia = scanner.nextDouble();
        double corrente = tensao / resistencia;

        String correnteFormatada = format.format(corrente);
        System.out.println("Corrente: " + correnteFormatada + " A");
    }
}

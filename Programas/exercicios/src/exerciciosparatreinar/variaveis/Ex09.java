package exerciciosparatreinar.variaveis;

/*
Desenvolver um programa que apresente e calcule o volume de uma caixa retangular, utilize a fórmula abaixo:

V=C*L*A

Onde:
	V = Volume em cm3
	C = Comprimento
	L = Largura
	A = Altura
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite o Comprimento da Caixa [cm]: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a Largura da Caixa [cm]: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a Altura da Caixa [cm]: ");
        double altura = scanner.nextDouble();
        double volume = comprimento * largura * altura;

        String volumeFormat = format.format(volume);
        System.out.println("Volume: " + volumeFormat + " cm³");
    }
}

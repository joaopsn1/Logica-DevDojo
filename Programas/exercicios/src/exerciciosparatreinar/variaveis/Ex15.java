package exerciciosparatreinar.variaveis;

/*
Construa um programa que calcule a velocidade em metros por segundo de um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:

V=(D*1000) / (T*60)

Onde:
	V = Velocidade em m/s
	D = Distância
	T = Tempo
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a Distância [Km]: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o tempo [min]: ");
        double tempo = scanner.nextDouble();
        double velocidade = (distancia * 1000) / (tempo * 60);

        String velocidadeFormat = format.format(velocidade);
        System.out.println("Velocidade: " + velocidadeFormat + " m/s");
    }
}

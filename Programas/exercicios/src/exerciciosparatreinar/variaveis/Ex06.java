package exerciciosparatreinar.variaveis;

/*
Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:

	D=TV
	LU=D / 12

	Onde:
		D = Distância em Km
		T = Tempo gasto na viagem
		V = Velocidade
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite o tempo de viagem [h]: ");
        double tempoViagem = scanner.nextDouble();
        System.out.print("Digite a velocidade [Km/h]: ");
        int velocidade = scanner.nextInt();
        double distancia = (int) (tempoViagem * velocidade);
        double litros = distancia / 12;

        String litrosFormatado = format.format(litros);
        System.out.println("Consumo da viagem: " + litrosFormatado + " L");
    }
}

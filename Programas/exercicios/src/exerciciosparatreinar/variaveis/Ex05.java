package exerciciosparatreinar.variaveis;

/*
Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo.

V = piR²*A

Onde:
	V = Volume
	pi = 3.141592654
	R = Raio da circunferência da lata
	A = Altura da lata
	OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatacao = new DecimalFormat("0.00");

        double pi = Math.PI;
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();
        double volumeLata = pi * (Math.pow(raio, 2)) * altura;

        String volumeFormatado = formatacao.format(volumeLata);
        System.out.println("Volume da lata: " + volumeFormatado + " cm³");
    }
}

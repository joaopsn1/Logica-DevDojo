package exerciciosparatreinar.variaveis;

/*
D) Ainda podemos realizar o cálculo de potência elétrica, desenvolva um rotina que calculo a potência de um equipamento, utilizando os dados e a fórmula a seguir:

		Dados:
		220 V  e 25 A

		Fórmula:
		P=U*I

		Onde:
		P = Potência em Watts
		U  = Tensão em Volts
		I = Corrente em Amperes

	BÔNUS: Altere o programa acima e permita que o usuário digite os valores
	para Volts  e Amperes.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a Tensão (V): ");
        double tensao = scanner.nextDouble();
        System.out.print("Digite a Corrente (A): ");
        double corrente = scanner.nextDouble();
        double potencia = tensao * corrente;

        String potenciaFormatada = format.format(potencia);
        System.out.println("Corrente: " + potenciaFormatada + " W");
    }
}

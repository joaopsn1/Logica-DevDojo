package exerciciosparatreinar.variaveis;

/*
Elaborar um programa que leia o salário base mensal (SB) de um funcionário e o percentual de reajuste (PR) e calcule e apresente o novo valor de salário do funcionário. A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:

	NS=SB + (SB*PR) / 100


	Onde:
		NS = Novo Salário
        SB = Salário Base
	    PR = Percentual de Reajuste
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite o Salário Base: R$ ");
        double salarioBase = scanner.nextDouble();
        double percentual = 5;
        double novoSalario = salarioBase + (salarioBase * percentual) / 100;

        String novoSalarioFormat = format.format(novoSalario);
        System.out.println("Valor do Salário com Reajuste: R$ " + novoSalarioFormat);
    }
}

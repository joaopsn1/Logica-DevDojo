package exerciciosparatreinar.variaveis;

/*
Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário. Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

SB = HT * VH
TD = (PD / 100) * SB
SL = SB  - TD

Onde:
SB =  Salário Base
HT = Horas Trabalhadas
	VH = Valor Hora de trabalho
	TD = Total de Descontos
PD = Percentual de Desconto
SL = Salário Líquido

 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatacao = new DecimalFormat("0.00");

        System.out.print("Digite as horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHoraTrabalho = scanner.nextDouble();
        double percentualDesconto = 5;
        double salarioBase = horasTrabalhadas * valorHoraTrabalho;
        double descontos = (percentualDesconto / 100) * salarioBase;
        double salarioLiquido = salarioBase - descontos;

        String salarioBaseFormatado = formatacao.format(salarioBase);
        System.out.println("Salário Base: R$ " + salarioBaseFormatado);

        String salarioLiquidoFormatado = formatacao.format(salarioLiquido);

        System.out.println("Salário Líquido: R$" + salarioLiquidoFormatado);
    }
}

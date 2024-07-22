package exerciciosparatreinar.variaveis;

/*
Na eletrônica existem diversas unidades de medida algumas delas são:

Unidade         Símbolo         O que mede      Símbolo Aritmético
Ampére              A       Corrente elétrica           I
Volt                V       Tensão elétrica             U
Ohm                 Ω       Resistência elétrica        R
Watt                W       Potência elétrica           P

Baseado nesses símbolos, existem alguns cálculos que podemos fazer utilizando a Lei de Ohm, que diz que tendo ao menos dois valores pode-se encontrar o terceiro.

Sendo assim:

A) Em um circuito elétrico temos as seguintes informações:
275 V e 10 A, calcule a resistência elétrica, utilizando a fórmula abaixo:

R=U/I

Onde:
	R = Resistência em Ohms
	U = Tensão em Volts
	I = Corrente em Amperes

BÔNUS: Altere o programa acima e permita que o usuário digite os valores
	para Volts  e Amperes.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a Tensão (V): ");
        double tensao = scanner.nextDouble();
        System.out.print("Digite a Corrente (A): ");
        double corrente = scanner.nextDouble();
        double resistencia = tensao / corrente;

        String resistenciaFormatada = format.format(resistencia);
        System.out.println("Resistência: " + resistenciaFormatada + " Ω");
    }
}

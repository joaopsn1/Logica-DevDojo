package exerciciosparatreinar.lacosderepeticao;

/*
Equação de Pell

A equação de Pell permite encontrar o resultado de uma operação de raiz quadrada apenas com subtrações sucessivas.

Exemplo:

27=??

Para obter a raiz quadrada de 27 procedemos da seguinte forma:

    1) 27 - 1 = 26
    2) 26 - 3 = 23
    3) 23 - 5 = 18
    4) 18 - 7 = 11
    5) 11 - 9 = 2

	Veja que 5 passos foram tomados sendo assim temos a parte inteira da raiz. Logo
	podemos dizer que 27=5.

	Desenvolva um programa que dado um número inteiro qualquer utilize a equação de
	Pell e calcule a parte inteira do resultado da raiz quadrada deste número.

	BÔNUS: Ainda utilizando a Equação de Pell existe uma forma de calcular os dígitos
	após a vírgula, tente incrementar o seu programa, acrescentando essa
	funcionalidade.
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para realizar a Equação de Pell: ");
        int equacaoPell = scanner.nextInt();
        int resultado = 1;
        int raiz = 0;

        for (int impar = 1; impar <= resultado ; impar+=2) {
            resultado = equacaoPell - impar;
            System.out.println(equacaoPell + " - " + impar + " = " + resultado);
            equacaoPell = resultado;
            raiz++;
        }

        if (resultado == 0) {
            System.out.println("Raiz Exata: " + raiz);
        } else {
            System.out.println("Raiz Aproximada: " + raiz);
        }

        /*
        while (impar < resultado) {
            resultado = equacaoPell - impar;
            System.out.println(equacaoPell + " - " + impar + " = " + resultado);
            equacaoPell = resultado;
            impar += 2;
        }
        */
    }
}

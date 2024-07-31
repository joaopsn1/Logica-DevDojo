package exerciciosparatreinar.arrays;

/**
 * Calculando Dígito Verificador de um CPF.
 *
 * O CPF (Cadastro de Pessoas Físicas) é composto por 11 dígitos ao todo, porém os 2 últimos dígitos são calculados, essa informação serve para determinarmos por exemplo, se um cpf é ou não válido.
 *
 * Para calcular um CPF existem alguns passo que precisam ser seguidos, veja abaixo:
 *
 * Vamos tomar como exemplo o CPF fictício 728.316.240-29, para calcular seus DVs vamos fazer as seguintes operações.
 *
 * Calculando o DV 1
 *
 * Dígito do CPF:  7   2   8   3   1   6   2   4   0   DV1
 * Multiplicador:  10  9   8   7   6   5   4   3   2
 * Resultado:      70  18  64  21  6   30  8   12  0
 *
 * Agora deve-se somar os resultados
 * 70+18+64+21+6+30+8+12+0= 229
 *
 * Agora deve-se calcular o módulo de 229 por 11, sendo assim:
 * 229 % 11 = 9
 *
 * E por fim deve-se subtrair esse resultado de 11, ou seja:
 * 11 - 9 = 2
 *
 * Se o resultado da subtração for maior que 9, o dígito verificador é ZERO. Caso contrário, o dígito verificador é o resultado dessa subtração. Neste caso, o primeiro dígito verificador é 2.
 *
 * E temos o primeiro dígito verificador
 *
 * CPF:    7   2   8   3   1   6   2   4   0   2
 *
 * Agora devemos calcular o segundo dígito verificador da seguinte forma
 *
 * Dígito do CPF:  7   2   8   3   1   6   2   4   0   2
 * Multiplicador:  11  10  9   8   7   6   5   4   3   2
 * Resultado:      77  20  72  24  7   36  10  16  0   4
 *
 * Agora deve-se somar os resultados
 * 77+20+72+24+7+36+10+16+0+4=266
 *
 * Agora deve-se calcular o módulo de 229 por 11, sendo assim:
 * 266 % 11 = 2
 *
 * E por fim deve-se subtrair esse resultado de 11, ou seja:
 * 11 - 2 = 9
 *
 * Se o resultado da subtração for maior que 9, o dígito verificador é ZERO. Caso contrário, o dígito verificador é o resultado dessa subtração. Neste caso, o primeiro dígito verificador é 9.
 *
 * E temos o segundo dígito verificador
 *
 * CPF:    7   2   8   3   1   6   2   4   0   2   9
 *
 * Uma vez entendido o problema escreva um programa que dados os 9 primeiros dígitos de um CPF calcule os dois dígitos verificadores.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cpf = new int[9];
        int[] multiplicador = new int[9];
        int[] resultado = new int[9];
        int soma1 = 0;
        int soma2 = 0;

        System.out.println("Digitando o CPF sem os dígitos verificadores");

        for (int i = 0; i < cpf.length; i++) {
            System.out.print((i + 1) + "° dígito do CPF: ");
            cpf[i] = scanner.nextInt();
        }
        System.out.println("CPF: " + cpf[0] + "" + cpf[1] + "" + cpf[2] + "." + cpf[3] + "" + cpf[4] + "" + cpf[5] + "." + cpf[6] + "" + cpf[7] + "" + cpf[8]);

        System.out.println("\nDigite o multiplicador decrescendo de 10 ");
        for (int i = 0; i < multiplicador.length; i++) {
            System.out.print((i + 1) + "° multiplicador: ");
            multiplicador[i] = scanner.nextInt();
            resultado[i] = cpf[i] * multiplicador[i];
            soma1 += resultado[i];
        }

        System.out.println("Multiplicador: " + multiplicador[0] + " " + multiplicador[1] + " " + multiplicador[2] + " " + multiplicador[3] + " " + multiplicador[4] + " " + multiplicador[5] + " " + multiplicador[6] + " " + multiplicador[7] + " " + multiplicador[8]);

        System.out.println("Resultado multiplicação: " + resultado[0] + " " + resultado[1] + " " + resultado[2] + " " + resultado[3] + " " + resultado[4] + " " + resultado[5] + " " + resultado[6] + " " + resultado[7] + " " + resultado[8]);

        System.out.println("Somando o resultado = " + soma1);

        int moduloSoma1 = soma1 % 11;
        int subtracao1 = 11 - moduloSoma1;

        if (subtracao1 > 9) {
            System.out.println("O 1° dígito verificador é 0!");
        } else {
            System.out.println("O 1° dígito verificador é " + subtracao1);
        }

        cpf = new int[10];
        multiplicador = new int[10];
        resultado = new int[10];

        System.out.println("\nAgora digite o CPF com o 1° valor do dígito verificador sendo " + subtracao1);
        for (int i = 0; i < cpf.length; i++) {
            System.out.print((i + 1) + "° dígito do CPF: ");
            cpf[i] = scanner.nextInt();
        }
        System.out.println("CPF com 1° dígito verificador: " + cpf[0] + "" + cpf[1] + "" + cpf[2] + "." + cpf[3] + "" + cpf[4] + "" + cpf[5] + "." + cpf[6] + "" + cpf[7] + "" + cpf[8] + "-" + cpf[9]);

        System.out.println("\nDigite o multiplicador decrescendo de 11 ");
        for (int i = 0; i < multiplicador.length; i++) {
            System.out.print((i + 1) + "° multiplicador: ");
            multiplicador[i] = scanner.nextInt();
            resultado[i] = cpf[i] * multiplicador[i];
            soma2 += resultado[i];
        }

        System.out.println("Multiplicador: " + multiplicador[0] + " " + multiplicador[1] + " " + multiplicador[2] + " " + multiplicador[3] + " " + multiplicador[4] + " " + multiplicador[5] + " " + multiplicador[6] + " " + multiplicador[7] + " " + multiplicador[8] + " " + multiplicador[9]);

        System.out.println("Resultado multiplicação: " + resultado[0] + " " + resultado[1] + " " + resultado[2] + " " + resultado[3] + " " + resultado[4] + " " + resultado[5] + " " + resultado[6] + " " + resultado[7] + " " + resultado[8] + " " + resultado[9]);

        System.out.println("Somando o resultado = " + soma2);

        int moduloSoma2 = soma2 % 11;
        int subtracao2 = 11 - moduloSoma2;

        if (subtracao2 > 9) {
            System.out.println("O 2° dígito verificador é 0!");
        } else {
            System.out.println("O 2° dígito verificador é " + subtracao2);
        }

        cpf = new int[11];

        System.out.println("\nAgora digite seu CPF de acordo com os cálculos obtidos, considerando os dígitos verificadores: " + subtracao1 + subtracao2);
        for (int i = 0; i < cpf.length; i++) {
            System.out.print((i + 1) + "° dígito do CPF: ");
            cpf[i] = scanner.nextInt();
        }
        System.out.println("Seu CPF: " + cpf[0] + "" + cpf[1] + "" + cpf[2] + "." + cpf[3] + "" + cpf[4] + "" + cpf[5] + "." + cpf[6] + "" + cpf[7] + "" + cpf[8] + "-" + cpf[9] + "" + cpf[10]);
    }
}

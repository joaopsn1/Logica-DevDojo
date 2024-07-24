package exerciciosparatreinar.condicionais;

/*
Crie uma calculadora que seja capaz de realizar as quatro operações básicas. Para tal cumpra-se os seguintes requisitos:

    a) A calculadora deve apresentar um menu e perguntar qual a operação desejada (+, -, * ou /).

    b) A calculadora deve solicitar os dois valores numéricos, realizar a operação e exibir o resultado.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int upperbound = 100;

        int number1 = random.nextInt(upperbound);
        int number2 = random.nextInt(upperbound);
        double resultado = 0;
        System.out.print("Digite a operação que deseja realizar [+ - * /]: ");
        String operacao = scanner.nextLine();

        switch (operacao) {
            case "+":
                resultado = number1 + number2;
                System.out.println(number1 + operacao + number2 + " = " + resultado);
                break;
            case "-":
                resultado = number1 - number2;
                System.out.println(number1 + operacao + number2 + " = " + resultado);
                break;
            case "*":
                resultado = number1 * number2;
                System.out.println(number1 + operacao + number2 + " = " + resultado);
                break;
            case "/":
                resultado = (double) number1 / number2;
                System.out.printf(number1 + operacao + number2 + " = %.2f\n", resultado);
                break;
            default:
                System.out.println("Operação não disponível!");
        }
    }
}

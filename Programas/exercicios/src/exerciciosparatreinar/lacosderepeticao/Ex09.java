package exerciciosparatreinar.lacosderepeticao;

/*
Melhore a calculadora desenvolvida no Ex07 de Condicionais acrescentando as seguintes funcionalidades:

    a) Sempre ao final de um cálculo a calculadora deve mostrar o menu novamente.

    b) Acrescentar uma opção para sair da calculadora, como sugestão, quando o usuário digitar 0 (zero) por exemplo, a calculadora deve ser encerrada.
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resultado;
        int opcaoMenu = 1;

        while (opcaoMenu != 0) {
            System.out.print("Digite o primeiro número: ");
            int number1 = scanner.nextInt();
            System.out.print("Digite a operação [+ - * /]: ");
            String operador = scanner.next();
            System.out.print("Digite o segundo número: ");
            int number2 = scanner.nextInt();
            switch (operador) {
                case "+":
                    resultado = number1 + number2;
                    System.out.printf(number1 + " " + operador + " " + number2 + " = %.2f\n", resultado);
                    break;
                case "-":
                    resultado = number1 - number2;
                    System.out.printf(number1 + " " + operador + " " + number2 + " = %.2f\n", resultado);
                    break;
                case "*":
                    resultado = number1 * number2;
                    System.out.printf(number1 + " " + operador + " " + number2 + " = %.2f\n", resultado);
                    break;
                case "/":
                    resultado = (double) number1 / number2;
                    System.out.printf(number1 + " " + operador + " " + number2 + " = %.2f\n", resultado);
                    break;
                default:
                    System.out.println("Este operador não está disponível na calculadora!");
            }
            System.out.println("Deseja continuar? [1 - Sim / 0 - Não] ");
            opcaoMenu = scanner.nextInt();
            System.out.println("Calculadora finalizada!");
        }
    }
}

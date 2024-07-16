package aula15;

/*
Dado um determinado salário;
Se o salário for maior que 4500, imprima 30% do valor;
Senão imprima 15% do valor;
Desafio: Utilize apenas uma variável para guardar o resultado e imprimir no final;
Desafio: Diga na impressão se é 30% ou 15%.
 */

import java.util.Scanner;

public class ImpostoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: R$ ");
        double salario = scanner.nextDouble();
        double porcentagem;
        double impostoSalario;
        if (salario > 4500) {
            porcentagem = 30;
            impostoSalario = salario * (porcentagem / 100);
            System.out.println("30% do salário é: R$ " + impostoSalario);
        } else {
            porcentagem = 15;
            impostoSalario = salario * (porcentagem / 100);
            System.out.println("15% do salário é: R$ " + impostoSalario);
        }
    }
}

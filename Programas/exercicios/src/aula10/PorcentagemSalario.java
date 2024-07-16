package aula10;

/*
Crie um valor de entrada para o salário;
Defina o valor da porcentagem;
Calcule a porcentagem do salário;
 */

import java.util.Scanner;

public class PorcentagemSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário: R$ ");
        double salario = scanner.nextDouble();
        System.out.print("Digite a porcentagem: ");
        double porcentagem = scanner.nextDouble();
        double valorDesconto = salario * (porcentagem / 100);
        double salarioComDesconto = salario - valorDesconto;
        System.out.println("O valor do salário com desconto é: R$ " + salarioComDesconto);
        System.out.println("O valor do desconto é: R$ " + valorDesconto);
    }
}

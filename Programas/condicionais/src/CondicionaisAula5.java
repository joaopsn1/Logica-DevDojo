//Calculo  Imposto de Renda

import java.util.Scanner;

public class CondicionaisAula5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double porcentagem;
        double desconto;
        double novoSalario;
        if (salario <= 2259.20) {
            System.out.println("ISENTO");
        } else if (salario >= 2259.21 && salario <= 2828.65) {
            porcentagem = 7.5;
            desconto = salario * (porcentagem / 100);
            novoSalario = salario - desconto;
            System.out.println("Salario com desconto de 7,5%: R$ " + novoSalario);
        } else if (salario >= 2828.66 && salario <= 3751.05) {
            porcentagem = 15;
            desconto = salario * (porcentagem / 100);
            novoSalario = salario - desconto;
            System.out.println("Salario com desconto de 15%: R$ " + novoSalario);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            porcentagem = 22.5;
            desconto = salario * (porcentagem / 100);
            novoSalario = salario - desconto;
            System.out.println("Salario com desconto de 22,5%: R$ " + novoSalario);
        } else {
            porcentagem = 27.5;
            desconto = salario * (porcentagem / 100);
            novoSalario = salario - desconto;
            System.out.println("Salario com desconto de 27,5%: R$ " + novoSalario);
        }
    }
}

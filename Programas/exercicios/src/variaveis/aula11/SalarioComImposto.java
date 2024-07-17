package variaveis.aula11;

/*
Crie uma variável que irá guardar o valor de um salário;
Calcule a porcentagem desse salário, sendo os valores da porcentagem:
- 30%;
- 15%;
- 5%;
A cada vez que você calcular guarde o resultado em uma variável;
Imprima o resultado e reutiliza a variável que guarda o resultado para o novo cálculo.
 */

import java.util.Scanner;

public class SalarioComImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário: R$ ");
        double salario = scanner.nextDouble();
        double decontoSalario = salario * 0.3;
        System.out.println("O desconto de 30% é: R$ " + decontoSalario);
        decontoSalario = salario * 0.15;
        System.out.println("O desconto de 15% é: R$ " + decontoSalario);
        decontoSalario = salario * 0.05;
        System.out.println("O desconto de 5% é: R$ " + decontoSalario);
    }
}

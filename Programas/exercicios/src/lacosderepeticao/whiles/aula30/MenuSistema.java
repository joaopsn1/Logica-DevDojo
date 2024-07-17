package lacosderepeticao.whiles.aula30;

/*
Como usuário eu gostaria de ter um menu visual que seja navegável através de números.
O menu deve ser exibido da seguinte forma:
1. Calcular Imposto;
2. Depositar Salário;
3. Sair;
O menu deve ficar disponível enquanto eu não digitar o número 3.
Desa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
 */

import java.util.Scanner;

public class MenuSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = 0;
        while (opcaoMenu != 3) {
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.print("Digite a sua opção: ");
            opcaoMenu = scanner.nextInt();
        }
        System.out.println("Menu Encerrado");
    }
}

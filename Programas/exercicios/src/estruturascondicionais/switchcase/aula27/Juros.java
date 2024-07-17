package estruturascondicionais.switchcase.aula27;

/*
Como gerente eu gostaria que meus usuários pudessem digitar o tipo da conta e o sistema imprima qual a porcentagemm de juros que aquela conta irá oferecer, com o intuito de agilizar o acesso as informações.
Os tipos das contas são:
- Conta Poupança - 0.05%;
- Conta Corrente - 0.02%;
- Conta Investimento - 0.1%;
 */

import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Conta: ");
        String conta = scanner.next();
        double porcentagemJuros;
        switch (conta) {
            case "Poupanca":
                porcentagemJuros = 0.05;
                System.out.println(porcentagemJuros + "%");
                break;
            case "Corrente":
                porcentagemJuros = 0.02;
                System.out.println(porcentagemJuros + "%");
                break;
            case "Investimento":
                porcentagemJuros = 0.1;
                System.out.println(porcentagemJuros + "%");
                break;
            default:
                System.out.println("Conta Inexistente");
        }
    }
}

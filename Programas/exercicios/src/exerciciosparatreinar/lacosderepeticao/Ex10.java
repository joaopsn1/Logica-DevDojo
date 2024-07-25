package exerciciosparatreinar.lacosderepeticao;

/*
Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e senha corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha, essa condição deve-se repetir até que o usuário acerte a combinação.
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String login = "Joao";
        final String senha = "12345";

        while (true) {
            System.out.print("Digite seu usuário: ");
            String tentativaLogin = scanner.nextLine();
            System.out.print("Digite sua senha: ");
            String tentativaSenha = scanner.nextLine();
            if (tentativaLogin.equals(login) && tentativaSenha.equals(senha)) {
                System.out.println("ACESSO CONCEDIDO!");
                break;
            }
            System.out.println("ACESSO NEGADO, TENTE NOVAMENTE!");
        }
    }
}

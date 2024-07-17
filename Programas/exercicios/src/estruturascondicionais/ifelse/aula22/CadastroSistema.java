package estruturascondicionais.ifelse.aula22;

/*
Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadasatrassem o nome de usuário (login) no sistema para agilizar o processo de migração do sistema antigo para o novo.

O usuário não pode deixar o vazio "", ou criar um usuário com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma mensagem "<nome do usário> cadastrado com sucesso."
Senão o sistema deverá ostrar o erro "Usuário inválido".
 */

import java.util.Scanner;

public class CadastroSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome de Usuário: ");
        String nomeUsuario = scanner.nextLine();
        if (nomeUsuario == "" || nomeUsuario.equalsIgnoreCase("admin") || nomeUsuario.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println(nomeUsuario + " cadastrado com sucesso!");
        }
    }
}

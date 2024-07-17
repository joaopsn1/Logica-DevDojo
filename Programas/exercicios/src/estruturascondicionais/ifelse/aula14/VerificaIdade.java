package estruturascondicionais.ifelse.aula14;

/*
Receba uma idade como entrada;
Se idade for >= que 18 imprima "Adulto";
Senão imprima "Ainda Não é Adulto".
 */

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Adulto!");
        } else {
            System.out.println("Ainda Não é Adulto!");
        }
    }
}

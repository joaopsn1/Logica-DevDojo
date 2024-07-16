package aula18;

/*
Escreva nome e idade de participantes de um torneio de natação e que o sistema imprimisse da seguinte forma:
- < 10 anos: <Nome> participará da categoria Infantil;
- Entre 11 e 15 anos: <Nome> participará da categoria Juvenil;
- Entre 16 e 19 anos: <Nome> participará da categoria Pré-Adulto;
- > 20 anos: <Nome> participará da categoria Adulto;
 */

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do Participante: ");
        String nome = scanner.next();
        System.out.print("Idade do Participante: ");
        int idade = scanner.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil!");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil!");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-adulto!");
        } else {
            System.out.println(nome + " participará da categoria Adulto!");
        }
    }
}

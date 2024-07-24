package exerciciosparatreinar.condicionais;

/*
Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4), e informe o status do aluno baseado na tabela abaixo:

        Média                        Status
Se a média for menor que 5.0         REPROVADO
Se a média for igual a 5.0           RECUPERAÇÃO
Se a média for maior que 5.0         APROVADO
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite sua Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite sua Nota 4: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media < 5) {
            System.out.println(media);
            System.out.println("REPROVADO");
        } else if (media == 5) {
            System.out.println(media);
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println(media);
            System.out.println("APROVADO");
        }
    }
}

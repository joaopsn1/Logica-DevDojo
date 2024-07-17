package estruturascondicionais.switchcase.aula24;

// Receba um número inteiro do usuário e imprima o dia da semana correspondente, sendo 1 Segunda-feira;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia da semana não correspondente!");
                break;
        }

        /*if (dia == 1) {
            System.out.println("Segunda-Feira");
        } else if (dia == 2) {
            System.out.println("Terça-Feira");
        } else if (dia == 3) {
            System.out.println("Quarta-Feira");
        } else if (dia == 4) {
            System.out.println("Quinta-Feira");
        } else if (dia == 5) {
            System.out.println("Sexta-Feira");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia da semana não correspondente!");
        }*/
    }
}

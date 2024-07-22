package exerciciosparatreinar.variaveis;

/*
Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia uma medida em pés e calcule o equivalente em metros.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0000");

        System.out.print("Digite a medida em ft: ");
        double medidaPes = scanner.nextDouble();
        double pesParaMetros = medidaPes * 0.3048;

        String pesParaMetrosFormat = format.format(pesParaMetros);
        System.out.println("Valor de Pés para Metros: " + pesParaMetrosFormat + " m");
    }
}

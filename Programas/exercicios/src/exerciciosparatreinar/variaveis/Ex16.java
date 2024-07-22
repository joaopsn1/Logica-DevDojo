package exerciciosparatreinar.variaveis;

/*
Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:

V=(4/3)*pi*(R³)

Onde:
V = Volume
pi = 3.141592654
R = Raio
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        double pi = Math.PI;
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        double volumeEsfera = (4 / 3) * pi * (Math.pow(raio, 3));

        String volumeEsferaFormat = format.format(volumeEsfera);
        System.out.println("Volume da Esfera: " + volumeEsferaFormat + " cm³");
    }
}

package estruturascondicionais.ifelse.aula23;

/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros para que eu possa agiliar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for masculino e a idade for >= 18 o sistema deve imprimir "alistamento obrigatório";
Se o sexo for Masculino e a idade for < 18 o sistema deve imprimir "alistamento não permitido";
Se o sexo for Feminino e a idade for >= 18 o sistema deve perguntar se a pessoa "deseja se aliastar?";
Se o sexo for Feminino e a idade for < 18 o sistema deve imprimir "alistamento não permitido".
 */

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sexo: ");
        String sexo = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        if (sexo.equalsIgnoreCase("M") && idade >= 18){
            System.out.println("Alistamento obrigatório!");
        } else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") && idade < 18) {
            System.out.println("Alistamento não permitido!");
        } else {
            System.out.println("Deseja se alistar?");
        }
    }
}

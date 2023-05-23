package Exercicios_Aula08;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salarioMinimo = 1212.00;

        System.out.println("------- || Digite o valor do seu salário: || -------");
        double salarioUsuario = entrada.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("Você ganha aproximadamente %.2f salários mínimos.%n ", quantidadeSalariosMinimos);


    }
}

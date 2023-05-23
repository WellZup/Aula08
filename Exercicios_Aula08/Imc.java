package Exercicios_Aula08;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double altura, peso, resultado;

        System.out.println("------- || Por favor informe seu nome: || -------\n");
        nome = entrada.next();

        System.out.println("------- || Agora informe sua altura: || -------\n");
        altura = entrada.nextDouble();

        System.out.println("------- || Informe seu peso: || -------");
        peso = entrada.nextDouble();

        resultado = peso / (altura * altura);

        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.printf("------- || Olá, " + nome + "! || -------}\n" + "------- || Seu IMC é de: " +
                formatador.format(resultado) +"|| -------}");


    }

}

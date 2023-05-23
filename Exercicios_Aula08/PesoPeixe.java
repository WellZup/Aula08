package Exercicios_Aula08;
import java.util.Scanner;

public class PesoPeixe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Regulamento de pesca de São Paulo 50kg
        //Multa de R$4,00 por quilo excedente
        int pesoPeixe, peixeExcedente;
        int pesoRegulamento = 50;
        int multa = 4;

        System.out.println("{------- || Digite o peso do Peixe: || -------}\n");
        pesoPeixe = entrada.nextInt();

        peixeExcedente = (pesoPeixe - pesoRegulamento) * multa;

        System.out.println("{------- || O peso excedente é de : || -------}\n" +
                (pesoPeixe - pesoRegulamento) + "Kg");

        System.out.println ("{------- || O valor a ser pago pelo excedente é de : || -------}\n" +
                "R$" + (peixeExcedente));


    }
}

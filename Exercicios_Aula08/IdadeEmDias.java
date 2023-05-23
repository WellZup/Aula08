package Exercicios_Aula08;
import java.util.Scanner;
public class IdadeEmDias {
    public static void main(String[] args) {
        int idade, anos, meses, dia, dias;
        Scanner entrada = new Scanner(System.in);

        System.out.println("------- ||Digite o ano que nasceu: ------- ||");
        anos = entrada.nextInt();

        System.out.println("------- ||Digite o mes que nasceu: ------- ||");
        meses = entrada.nextInt();

        System.out.println("------- ||Digite o dia que nasceu: ------- ||");
        dia = entrada.nextInt();

        idade = 2023 - anos - 1;
        dias = (anos * 365) + (meses * 30) + dia;

        System.out.println("------- ||A sua idade em dias é: " + dias + " dias.------- ||");



         //idade em dias = ano*365 + mes*30 + dias
    }
}

// Escreva um programa que receba uma temperatura em graus centígrados e a apresente em graus Fahrenheit.

import java.util.Scanner;

public class questao4 {
    public static void main (String[] args){
        Scanner en = new Scanner(System.in);

        Double c, f;

        System.out.println("Digite a temperatura em °C: ");
        c = en.nextDouble();

        f = c * 1.8 + 32;

        System.out.println(c + "°C convertendo em fahrenheit é " + f + "°F");
        en.close();
    }
}

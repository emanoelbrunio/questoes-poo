// Escreva um programa que recebe um valor inteiro representando um intervalo em minutos e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

import java.util.Scanner;

public class questao6 {
    public static void main (String[] args){
        int totMin, minutos = 0, horas = 0, dias = 0, i = 1;
        Scanner en = new Scanner(System.in);

        System.out.println("Insira uma quantidade de minutos: ");
        totMin = en.nextInt();
        
        while(i <= totMin){
            minutos++;    
            if (minutos == 60){
                horas++;
                minutos = 0;

                if (horas == 24){
                    dias++;
                    horas = 0;
                }
            }
            i++;
        }

        System.out.printf("%d dias, %d horas e %d minutos\n", dias, horas, minutos);
        en.close();
    }
}

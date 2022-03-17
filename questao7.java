// Escreva um programa que lê um número que representa o valor da carta, de um (ás) a treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 = espadas). O programa deve imprimir o nome da carta por extenso.

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);
        int entCarta, entNaipe;
        String nomeCarta = "", nomeNaipe = "", frase = "";
    
        do {
            System.out.printf("|===============================|\n");
            System.out.printf("| Insira o número da carta: ");
            entCarta = ent.nextInt();
            System.out.printf("|===============================|\n\n\n");
            
            System.out.printf("|===============================|\n");
            System.out.printf("|        Opções de naipes       |\n");
            System.out.printf("|===============================|\n");
            System.out.printf("| 1 - ouros                     |\n");
            System.out.printf("| 2 - paus                      |\n");
            System.out.printf("| 3 - copas                     |\n");
            System.out.printf("| 4 - espadas                   |\n");
            System.out.printf("|===============================|\n");

            System.out.printf("|===============================|\n");
            System.out.printf("| Insira o número do naipe: ");
            entNaipe = ent.nextInt();
            System.out.printf("|===============================|\n");
                
            if (entCarta <= 0 || entCarta >= 14 || entNaipe <= 0 || entNaipe >= 5){
                System.out.printf("|=======================================|\n");
                System.out.printf("| ALGUM DADO INSERIDO FORA DO INTERVALO |\n");
                System.out.printf("|=======================================|\n\n\n");
            }
        } while(entCarta <= 0 || entCarta >= 14 || entNaipe <= 0 || entNaipe >= 5);
        
        switch (entCarta) {
            case 1:
                nomeCarta = "Ás";
                break;
            case 2:
                nomeCarta = "Dois";
                break;
            case 3:
                nomeCarta = "Três";
                break;
            case 4:
                nomeCarta = "Quatro";
                break;
            case 5:
                nomeCarta = "Cinco";
                break;
            case 6:
                nomeCarta = "Seis";
                break;
            case 7:
                nomeCarta = "Sete";
                break;
            case 8:
                nomeCarta = "Oito";
                break;
            case 9:
                nomeCarta = "Nove";
                break;
            case 10:
                nomeCarta = "Dez";
                break;
            case 11:
                nomeCarta = "Valete";
                break;
            case 12:
                nomeCarta = "Dama";
                break;
            case 13:
                nomeCarta = "Reis";
                break;
        }

        switch (entNaipe) {
            case 1:
                nomeNaipe = "ouros";
                break;
            case 2:
                nomeNaipe = "paus";
                break;
            case 3:
                nomeNaipe = "copas";
                break;
            case 4:
                nomeNaipe = "espadas";
                break;
        }


        frase += ("" + nomeCarta + " de " + nomeNaipe);

        System.out.println("");
        System.out.println("");
        System.out.println("|=======================|");
        System.out.println("| " + frase);
        System.out.println("|=======================|");
        ent.close();
    }
}

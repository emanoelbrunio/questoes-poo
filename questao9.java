// Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);
        float x1, y1, x2, y2;
        String frase = "O segundo ponto está ";

        System.out.printf("Insira o x1: ");
        x1 = ent.nextFloat();
        System.out.printf("Insira o y1: ");
        y1 = ent.nextFloat();
        System.out.printf("Insira o x2: ");
        x2 = ent.nextFloat();
        System.out.printf("Insira o y2: ");
        y2 = ent.nextFloat();

        if (y2 > y1){
            frase += "acima e ";
        }
        else if (y2 < y1){
            frase += "abaixo e ";
        }
        else {
            frase += "na mesma linha horizontal e ";
        }

        if (x2 > x1){
            frase += "à direita do primeiro ponto";
        }
        else if (x2 < x1){
            frase += "à esquerda do primeiro ponto";
        }
        else {
            frase += "na mesma linha vertical do primeiro ponto";
        }

        System.out.println("");
        System.out.println(frase);

        ent.close();
    }
}

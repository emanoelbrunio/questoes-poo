// Escreva um programa que calcule a área de um quadrado.
//O valor do lado de um quadrado deverá ser informado pelo usuário.

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args){

        double lado, area;
        Scanner ent = new Scanner(System.in);

        
        System.out.print("Insira o valor de um lado: ");
        lado = ent.nextDouble();
        
        area = Math.pow(lado, 2);

        System.out.println("Area do quadrado é " + area);
        ent.close();
    }
}

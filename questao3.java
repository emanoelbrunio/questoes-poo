// Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.

import java.util.Scanner;

public class questao3 {
    public static void main (String[] args){

        Double ang, rad, sen, coss, tan, cossec, sec, cotan;
        Scanner ent = new Scanner(System.in);

        System.out.printf("Escreva o angulo que seja converter: ");
        ang = ent.nextDouble();

        rad = Math.toRadians(ang);

        sen = Math.sin(rad);
        coss = Math.cos(rad);
        tan = Math.tan(rad);
        
        cossec = 1 / sen;
        sec = 1 / coss;
        cotan = 1 / tan;
        
        System.out.printf("O valor de %.2g° em radianos é %g\n", ang, rad);
        System.out.println("Seno: "+ sen);
        System.out.println("Cosseno: " + coss);
        System.out.println("Tangente: "+ tan);
        
        System.out.println();
        
        System.out.println("Cossecante: " + cossec);
        System.out.println("Secante: " + sec);
        System.out.println("Cotangente: " + cotan);

        ent.close();
    }
    
}

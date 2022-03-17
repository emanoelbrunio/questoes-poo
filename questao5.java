// Escreva um programa que receba um número de 3 dígitos no formato CDU e o reescreva no formato UCD. Exemplo: 123 deve ser reescrito como 312.

import java.util.Scanner;

public class questao5 {
    public static void main (String[] args){
        int cdu, cd, u;
        Scanner en = new Scanner(System.in);

        System.out.println("Insira um numero de 3 digitos: ");
        cdu = en.nextInt();
        
        cd = cdu / 10;
        u = cdu%cd;

        System.out.printf("%d%d\n\n", u,cd);

        en.close();
    }    
}

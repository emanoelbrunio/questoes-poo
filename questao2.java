// Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.

// Os resultados devem ser divulgados arredondados em 1 casa decimal (utilize a função arredondar da biblioteca Math).
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        
        double n1, n2, n3, soma, media;

        Scanner ent = new Scanner(System.in);

        System.out.print("Insira n1: ");
        n1 = ent.nextDouble();

        System.out.print("Insira n2: ");
        n2 = ent.nextDouble();

        System.out.print("Insira n3: ");
        n3 = ent.nextDouble();
        
        soma = n1 + n2 + n3;
        media = soma / 3;

        System.out.printf("A soma é %.2f e a media é %.2f\n", soma, media);
        ent.close();
    }
}

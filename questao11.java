import java.util.Scanner;

public class questao11 {    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int i;

        System.out.print("|========================|\n");
        System.out.print("| Digite o valor de n: ");
        int n = ent.nextInt();
        System.out.print("|========================|\n\n");

        int n1 = 1;

        int aux1 = 1;
        int aux2 = 0;

        for(i = 0; i < n; i++){
            System.out.print("| " + n1 + " |");
            n1 += aux2;
            aux2 = aux1;
            aux1 = n1;
        }
        System.out.println();
        ent.close();
    }  

}

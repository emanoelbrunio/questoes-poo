import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String t = "";
        System.out.print("Numero: ");
        num = sc.nextInt();

        System.out.println("Fatorial de " + num + " = " + fatorial(num, t));
        
        sc.close();
    }

    public static long fatorial(int n, String t) {

        if (n == 0) {
            return 1;
        }
        else {
                        
            
            System.out.println("-----------------------------------------------------------");
            System.out.println(t + "Valor de N: " + n);
            System.out.println(t + "Valor chamada recursiva: " + n*(n-1));
            System.out.println("-----------------------------------------------------------");
            System.out.println();
            

            return n*fatorial(n-1, t+="\t");
        }
    }
}


import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int m, n;

        System.out.printf("Insira o M: ");
        m = ent.nextInt();

        System.out.printf("Insira o N: ");
        n = ent.nextInt();
        
        System.out.println(mdc(m,n));

        ent.close();

    }

    public static int mdc(int m, int n){
        
        if(n>m){
            return mdc(n, m);
        }
        if(n == 0){
            return m;
        }else{
            return mdc(n, m%n);
        }
    }
}

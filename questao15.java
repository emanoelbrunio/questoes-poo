import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int base, exp;
        System.out.printf("Insira a base: ");
        base = ent.nextInt();

        System.out.printf("Insira o expoente: ");
        exp = ent.nextInt();

        System.out.print("Potencia(" + base + ", " + exp + ") = " + potencia(base, exp));

        ent.close();
        
    }
    
    public static String potencia (int base, int expoente){
        String txt = "";

        if(expoente == 0){
            txt += txt + "\n";
            return(txt);
        }
        else if(expoente > 1){
            txt += base + " * ";
        }
        else if (expoente == 1) {
            txt += base;
        }
        return txt + potencia(base, expoente-1);
    }
}

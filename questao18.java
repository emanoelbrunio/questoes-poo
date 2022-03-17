import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = ent.nextInt();

        String primo = primo(num, 1, 0);

        System.out.println("O numero " + primo);
              
        ent.close();
    }

    public static String primo(int num, int cont, int qtdDiv){

        if(num%cont == 0){
            qtdDiv += 1;
        }

        if(qtdDiv > 2){
            return "NÃO É PRIMO";
        }

        if (qtdDiv == 2 && cont == num){
            return "é primo";
        }

        return primo(num, cont+1, qtdDiv);
    }
}

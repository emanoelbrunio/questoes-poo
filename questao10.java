public class questao10 {
    public static void main(String[] args) {
        int numero = 1;
        int i, j;
        for(i = 0; i < 6; i++){
            for(j = 0; j < 10; j++){

                if(numero < 10){
                    System.out.print("|" + numero + " |");
                }
                else{
                    System.out.print("|" + numero + "|");
                }
                numero++;
            }
            System.out.println();
        }
    }

}

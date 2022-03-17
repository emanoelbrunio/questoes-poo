public class questao14 {
    public static void main(String[] args) {
        double cidadeA = 7000;
        double cidadeB = 20000;
        int anos = 0;

        while(cidadeA <= cidadeB){

            cidadeA += cidadeA * 0.035;
            cidadeB += cidadeB * 0.01;
            anos += 1;
        }

        System.out.println("Precisará de " + anos + " anos.");
    }
}

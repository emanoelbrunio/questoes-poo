public class questao13 {
    public static void main(String[] args) {
        int i;
        System.out.println("|=====|");
        
        for(i = 100; i <= 999; i++){

            int uni_cent = (i/100);

            int uni_dez = (i - uni_cent*100) / 10;
            int uni = i - (uni_dez * 10 + uni_cent * 100);
            
            double num1 = Math.pow(uni_cent, 3);
            double num2 = Math.pow(uni_dez, 3);
            double num3 = Math.pow(uni, 3);
            
            if((num1 + num2 + num3) == i ){
                System.out.println("| "+ i + " |");
            }
        }
        System.out.println("|=====|");
    }
}

// public class questao12 {
//     public static void main(String[] args) {
//         int aux = 0;
//         int soma = 0;
//         int n = 10000;

//         for(int i = 1; i < n; i++){
//             int num[];
//             num = new int[63];
//             aux = 0;
//             soma = 0;
//             for(int j = i -1; j >= 1; j--){
//                 //System.out.println(j);
//                 if(i%j == 0){
//                     num[aux] = j;
//                     aux += 1;
//                 }
//             }
//             for(int k = 0; k <= num.length - 1; k++){
//                 soma += num[k];
//             }
//             if(soma == i){
//                 System.out.println(i);
//             }
//         }
//     }
       
// }

public class questao12 {

	public static void main(String[] args) {
 
        int i, j;
        int n = 10000;

    	for (i = 1; i < n; i++) {

        	int valor = 0;
        	
        	for (j = 1; j < i; j++) {
            	if (i % j == 0) {
                	valor += j;
                }
        	}

        	if (valor == i) {
                System.out.println("Numero perfeito: " + i + "\n");
            }
    	}
	}
}
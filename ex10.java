public class ex10 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int[] soma = new int[3];
        
        for(int i= 0; i< 3; i++){
            soma[i] = vetor1[i] + vetor2[i]; 
        }
        System.out.print("Vetor Soma: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(soma[i] + " ");
        }
    }
}

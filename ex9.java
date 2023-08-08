
public class ex9 {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5}; 
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] *= 2;
        }

         System.out.println("O número é:  "); 
        for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
        }
    }
        
}



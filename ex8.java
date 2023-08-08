import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
       
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

         Scanner scanner = new Scanner(System.in); 
         
         System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        boolean encontrado = false;


        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == numeroDigitado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O número " + numeroDigitado + " está presente no vetor.");
        } else {
            System.out.println("O número " + numeroDigitado + " não está presente no vetor.");
        }    
      scanner.close();
   
    }  

}

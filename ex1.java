

public class ex1{//class ex1
    public static void main(String[] args) {// metodo priincipal
        // Declaração do vetor com 5 números inteiros
        int[] vetor = {1, 2, 3, 4, 5};

        // Variável para acumular a soma dos elementos
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
          System.out.println("Os elementos do vetor são: " + vetor[i]);  
          /*
           vetor[0] = 1
           vetor[1] = 2
           vetor[2] = 3
           vetor[3] = 4
           vetor[4] = 5
          */
        
        }
        // Loop "for" para percorrer o vetor e acumular a soma dos elementos
        for (int i = 0; i < vetor.length; i++) {// declaração da variavel; Condição do laço; incrementa i;
            soma = soma + vetor[i];
            /*
             * soma = 0 + vetor[0]; 0 + 1
             * soma = 1 + vetor[1]; 1 + 2
             * soma = 3 + vetor[2]; 3 + 3
             * soma = 6 + vetor[3]; 6 + 4
             * soma = 10 + vetor[4]; 10 + 5
             */
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);

        // Exibe o resultado da soma
    }
}

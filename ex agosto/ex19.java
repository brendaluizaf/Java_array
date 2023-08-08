import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nome = new String[5];
        int[] tempo = new int[5];
        
        for (int i = 0; i < 5; i++){
            System.out.print("Adicione um nome " + (i + 1) + ": ");
            nome[i]= scanner.nextLine();

        // Registro dos preços da ação
        for ( i = 0; i < tempo.length; i++) 
            System.out.print("Digite o tempo " + (i + 1) + ": ");
            tempo[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        
        int indiceVencedor = encontrarVencedor(tempo);
        System.out.println("O nadador vencedor é: " + nome[indiceVencedor]);
    }

    public static int encontrarVencedor(int[] tempo) {
        int indiceVencedor = 0;
        int menorTempo = tempo[0];
        
        for (int i = 1; i < tempo.length; i++) {
            if (tempo[i] < menorTempo) {
                menorTempo = tempo[i];
                indiceVencedor = i;
            }
        }
        
        return indiceVencedor;
    }  
}

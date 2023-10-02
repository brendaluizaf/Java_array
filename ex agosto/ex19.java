import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nome = new String[5];
        int[] dias = new int[7];
        
        for (int i = 0; i < nome.length; i++){
            System.out.println("Adicione um nome " + (i + 1) + ": ");
            nome[i]= scanner.nextLine();

        // Registro dos preços da ação
        for ( i = 0; i < dias.length; i++) 
            System.out.println("Digite a quantidade de calorias " + (i + 1) + ": ");
            dias[i] = scanner.nextInt();
        
        }
        scanner.close();
        
        int indiceVencedor = encontrarVencedor(dias);
        System.out.println("quem consumiu maior quantidade de calorias foi: " + nome[indiceVencedor]);
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

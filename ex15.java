import java.util.Scanner;
import java.util.Random;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de convidados: ");
        int quantidadeConvidados = scanner.nextInt();
        
        String[] nomesConvidados = new String[quantidadeConvidados];
        
        for (int i = 0; i < quantidadeConvidados; i++) {
            System.out.print("Nome do convidado " + (i + 1) + ": ");
            scanner.nextLine(); // Limpar o buffer
            nomesConvidados[i] = scanner.nextLine();
        }
        
        Random random = new Random();
        int[] numerosSorteados = new int[3];
        
        for (int i = 0; i < 3; i++) {
            numerosSorteados[i] = random.nextInt(quantidadeConvidados);
        }
        
        System.out.println("\nConvidados sorteados:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + nomesConvidados[numerosSorteados[i]]);
        }
        scanner.close();
    }
}


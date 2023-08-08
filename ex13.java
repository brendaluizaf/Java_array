import java.util.Random;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int[] tentativas = new int[100];

        Scanner scanner = new Scanner(System.in);

        int tentativaAtual = 0;
        int chute;

        while (true) {
            System.out.print("Digite um número entre 1 e 100: ");
            chute = scanner.nextInt();
            tentativas[tentativaAtual] = chute;
            tentativaAtual++;

            if (chute < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (chute > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto " + numeroSecreto + " em " + tentativaAtual + " tentativas.");
                break;
            }
        }

        // Exibindo todas as tentativas realizadas pelos amigos
        System.out.print("Tentativas: ");
        for (int i = 0; i < tentativaAtual; i++) {
            System.out.print(tentativas[i] + " ");
        }

        scanner.close();
    }
}


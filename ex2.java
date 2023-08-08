import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja"};

        Scanner scanner = new Scanner(System.in);
        int indice;

        do {
            System.out.println("Digite um número de 0 a 2 para obter o nome da fruta correspondente:");
            indice = scanner.nextInt();

            if (indice < 0 || indice >= frutas.length) {
                System.out.println("Índice inválido. Digite um número entre 0 e " + (frutas.length - 1));
            }
        } while (indice < 0 || indice >= frutas.length);

        String frutaSelecionada = frutas[indice];
        System.out.println("A fruta correspondente ao índice " + indice + " é: " + frutaSelecionada);

        scanner.close();
    }
}

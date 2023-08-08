import java.util.Scanner;

public class ex11 { // class ex11
    public static void main(String[] args) { // método main (principal)
        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[5];

        // FUNÇÃO ENTRADA DO USUÁRIO
        for (int i = 0; i < palavras.length; i++) {
            System.out.print("Adicione um ítem " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine(); // Lê a entrada do usuário (a linha inteira)
            /*
             * palavras[0] = scanner.nextline(); = primeiro valor preenchido do vetor
             * palavras[1] = scanner.nextline();
             */
        }

        System.out.println("Itens inseridos:");

        // FUNÇÃO IMPRIMIR OS DADOS
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
            /*
             * println(palavras[0]) = 10
             * println(palavras[1]) = 20
             * println(palavras[4]) = 50
             */
        }
        scanner.close();
    }
}

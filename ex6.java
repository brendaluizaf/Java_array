import java.util.Scanner;
public class ex6 {
    
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); 
  
  String[] palavras = new String[4];

     // Pedir ao usuário para digitar as 4 palavras e armazená-las no vetor
    for (int i = 0; i < 4; i++){
        System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
    }
             
    scanner.close();

    // Exibir as palavras na ordem em que foram digitadas usando um loop "for"
    System.out.println("Palavras digitadas:");
        
    for (int i = 0; i < 4; i++) {
    System.out.println(palavras[i]);
    } 
  }
}


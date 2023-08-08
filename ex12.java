import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int semana = 7;
        Float[] grau = new Float[semana];

        float soma = 0;

        for(int i= 0; i < semana; i++){
            System.out.print("Adicione um ítem " + (i + 1) + ": ");
            grau[i]= scanner.nextFloat();
            soma = soma + grau[i];
        }

         System.out.println("As temperaturas da semana são: ");

        float media = soma / grau.length;
        
        for (int i = 0; i < grau.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + grau[i]);
        }

        System.out.println("A média das temperaturas da semana é: " + media);

        scanner.close();
    }   
}

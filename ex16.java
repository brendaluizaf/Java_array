import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int semana = 7;
        Float[] venda = new Float[semana];

        float soma = 0;

        for(int i= 0; i < semana; i++){
            System.out.print("Adicione o valor " + (i + 1) + ": ");
            venda[i]= scanner.nextFloat();
            soma = soma + venda[i];
        }

         System.out.println("As vendas da semana são: ");

        float media = soma / venda.length;
        
        for (int i = 0; i < venda.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + venda[i]);
        }

        System.out.println("A média dos valores obtidos na semana é de R$: " + media);

        scanner.close();
    }   
}

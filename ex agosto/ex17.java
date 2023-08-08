import java.util.Scanner;
public class ex17 {
    public static void main(String[] args){
        
        String[]nome=  new String[5];
        int[]quantidade= new int[5];
        

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Adicione um nome " + (i + 1) + ": ");
            nome[i]= scanner.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Adicione a quantidade " + (i + 1) + ": ");
            quantidade[i]= scanner.nextInt();
        }

        for(int i = 0; i < 5; i++){
         System.out.println("Quantidade " + (i + 1) + ": " + nome[i]  + " " + quantidade[i] );   
        }
        scanner.close();
    }
}

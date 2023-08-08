import java.util.Scanner;
public class ex14 {
    public static void main(String[] args){
        
       
        String[] tarefas = new String[5];
        double[] horario = new double[5];
        double soma=0;
       
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++){
            System.out.print("Adicione uma tarefa " + (i + 1) + ": ");
            tarefas[i]= scanner.next();
            System.out.print("Adicione um horário " + (i + 1) + ": ");
            horario[i]= scanner.nextDouble();
            soma = soma + horario[i];
        }
        System.out.println("O horário total do projeto é: " + soma);
        scanner.close();
    }
}


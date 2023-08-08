import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int MAX_DIAS = 10;
        double[] precosAcao = new double[MAX_DIAS];
        
        // Registro dos preços da ação
        for (int i = 0; i < MAX_DIAS; i++) {
            System.out.print("Digite o preço da ação no dia " + (i + 1) + ": ");
            precosAcao[i] = scanner.nextDouble();
        }
        
        double maiorVariacao = 0;
        int diaInicio = 0;
        int diaFim = 0;
        
        // Cálculo da maior variação de preço
        for (int i = 1; i < MAX_DIAS; i++) {
            double variacao = (precosAcao[i] - precosAcao[i - 1]);
            if (variacao > maiorVariacao) {
                maiorVariacao = variacao;
                diaInicio = i;
                diaFim = i + 1;
            }
        }
        scanner.close();
        
        System.out.println("\nMaior variação de preço:");
        System.out.println("Dia " + diaInicio + " para Dia " + diaFim);
        System.out.println("Variação: " + maiorVariacao);
    }  
}

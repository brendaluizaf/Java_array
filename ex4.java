public class ex4 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0, 8.5};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("As notas dos alunos são: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("A média das notas é: " + media);
    }
}


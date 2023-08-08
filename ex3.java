public class ex3{
    public static void main(String[] args) {
        int[] numeros = {10, 5, 20, 8, 15, 25, 12, 18};
        int maiorValor = numeros[0]; // Assume que o primeiro valor é o maior

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }

        System.out.println("O maior valor presente no vetor é: " + maiorValor);
    }
}

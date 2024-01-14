public class Exerc1 {

    public static void main(String[] args) {
        
        int vetor[] = {2, 0, 9, 75, 15, 22, 21, 50};
        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

    }
}

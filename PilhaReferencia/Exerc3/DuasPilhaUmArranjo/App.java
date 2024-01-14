import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int vet;
        Random num = new Random();

        Pilha pilha = new Pilha();

        while (!pilha.isCheio()) {
            n = num.nextInt(100)+1;
            vet = num.nextInt(2)+1;
            try {
                pilha.push(n, vet);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Vetor total: ");
        for (int i = 0; i < pilha.vetor.length; i++) {
            System.out.print(pilha.vetor[i] + " ");
        }

        System.out.println();
        
        System.out.println("Vetor 1, tamanho(" + pilha.tam1 + "): ");
        while (pilha.tam1 != 0) {
            try {
                n = pilha.pop(1);
                System.out.print(n + " ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();

        System.out.println("Vetor 2, tamanho(" + pilha.tam2 + "): ");
        while (pilha.tam2 != -1) {
            try {
                n = pilha.pop(2);
                System.out.print(n + " ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        PilhaReferencia pilha = new PilhaReferencia();
        Carta c;

        System.out.println("- BLACKJACK - ");

        while (true) {
            
            System.out.println("- Jogador 1 -");
            System.out.println("Total: " + pilha.totalJ1());
            System.out.println("Mais uma carta ?");
            System.out.println("1 - sim, 2 - não");

            if (sc.nextInt() == 1) {
                c = new Carta(random.nextInt(13)+1);              
                if (!pilha.push(c, 1)) {
                    System.out.println("Penalidade aplicada! -5");
                    System.out.println("Total: " + pilha.totalJ1());
                    break;  
                }              
            } else {
                break;
            }
            
        }

        while (true) {
            
            System.out.println("- Jogador 2 -");
            System.out.println("Total: " + pilha.totalJ2());
            System.out.println("Mais uma carta ?");
            System.out.println("1 - sim, 2 - não");

            if (sc.nextInt() == 1) {
                c = new Carta(random.nextInt(13)+1);              
                if (!pilha.push(c, 2)) {
                    System.out.println("Penalidade aplicada! -5");
                    System.out.println("Total: " + pilha.totalJ2());
                    break;   
                }             
            } else {
                break;
            }
            
        }

        if (pilha.totalJ1() > pilha.totalJ2()) {
            System.out.println("* * * Jogador 1 VENCEU * * *");
            System.out.println("Cartas: ");
            while (!pilha.isVaziaJ1()) 
                System.out.println(pilha.pop(1));           
        } else if (pilha.totalJ2() > pilha.totalJ1()) {
            System.out.println("* * * Jogador 2 VENCEU * * *");
            System.out.println("Cartas: ");
            while (!pilha.isVaziaJ2()) 
                System.out.println(pilha.pop(2));
        } else {
            System.out.println("   :(     EMPATE     :(");
        }



        sc.close();
    }
}

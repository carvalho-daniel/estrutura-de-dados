import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        int qtd;
        int num;


        System.out.println(" --- ___ --- ICANNOBIF --- ___ ---");
        System.out.print("Quantidade da sequência: ");
        qtd = sc.nextInt();

        for (int i = 2; i < qtd; i++) {
            num = pilha.topo.num + pilha.topo.prox.num;
            pilha.push(num);
        }

        System.out.println("Sequência Icannobif: ");
        while (!pilha.isVazia()) {
            try {
                num = pilha.pop();
                System.out.print(num + " ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
            
        }

        sc.close();
    }

}
import java.util.Scanner;

public class App {

    static int vetor[] = new int[10];
    static int tam = 0;
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String esc;
        int posicao;
        int num;

        while (true) {

            System.out.println("_______________________");
            System.out.println("          menu         ");
            System.out.println("1 - adicionar");
            System.out.println("2 - remover");
            System.out.println("3 - sair");

            esc = sc.nextLine();

            if (esc.equals("1")) {
                
                print();

                System.out.print("Número: ");
                num = sc.nextInt();

                System.out.print("Posição (1 até 10): ");
                posicao = sc.nextInt();

                try {
                    add(num, posicao);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                
                print();

            } else if (esc.equals("2")) {
                print();

                System.out.println("Posição: ");
                posicao = sc.nextInt();

                try {
                    remove(posicao);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                print();

            } else {
                break;
            }

            sc.nextLine();
            System.out.println("Deseja realizar mais uma operação ? ");
            System.out.println("1 - sim, 2 - não");
            if (!(sc.nextLine().equals("1"))) {
                break;
            }
        }

        sc.close();
    }

    public static void print() {
        System.out.println("Vetor: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    
    public static void add(int num, int posicao) throws Exception  {
        posicao--;
        if (tam == vetor.length)
            throw new Exception("Vetor cheio!");

        if (posicao < 0 || posicao > 9) 
            throw new Exception("Posição inválida!");
        
        if (tam == 0) {
            vetor[tam] = num;
        } else {
            for (int i = tam; i > posicao; i--) {
                vetor[i] = vetor[i-1];
            }
            vetor[posicao] = num;
        }
        
        tam++;
    }

    public static void remove(int posicao) throws Exception {
        posicao--;
        if (tam == 0)
            throw new Exception("Vetor vazio!");

        if (posicao < 0 || posicao > 9) 
            throw new Exception("Posição inválida!");

        
        for (int i = posicao; i < tam; i++) {
            vetor[i] = vetor[i+1];
        }
        tam--;
                    
    }

    

}
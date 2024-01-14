import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Fila<String> q = new Fila<>();
        Fila<String> a = new Fila<>();
        Fila<String> b = new Fila<>();
        String nome;
        String operacao;
        String op;

        while (true) {
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Operação: ");
            operacao = sc.nextLine();

            q.enfileirar(nome);
            q.enfileirar(operacao);

            System.out.println("Deseja adicionar mais um nome? ");
            System.out.println("1 - sim, 2 - nao");
            op = sc.nextLine();
            if (!op.equals("1")) {
                break;
            }
        }

        // teste prontos :)

        // q.enfileirar("Luis");
        // q.enfileirar("B");
        // q.enfileirar("Pedro");
        // q.enfileirar("A");
        // q.enfileirar("Luisa");
        // q.enfileirar("A");
        // q.enfileirar("Joao");
        // q.enfileirar("X");
        // q.enfileirar("Jose");
        // q.enfileirar("X");
        // q.enfileirar("Miguel");
        // q.enfileirar("B");


        while (!q.isVazia()) {
            nome = q.desenfileirar();
            operacao = q.desenfileirar();

            if (operacao.equals("A")) {
                a.enfileirar(nome);
            } else if (operacao.equals("B")) {
                b.enfileirar(nome);
            } else if (operacao.equals("X")) {
                if (a.tamanho() < b.tamanho()) {
                    a.enfileirar(nome);         
                } else if (b.tamanho() < a.tamanho()) {
                    b.enfileirar(nome);
                }
            }
        }

        System.out.println("---- FILA A ----");
        while (!a.isVazia()) {
            nome = a.desenfileirar();
            System.out.println(nome);
        }

        System.out.println("---- FILA B ----");
        while (!b.isVazia()) {
            nome = b.desenfileirar();
            System.out.println(nome);
        }
        sc.close();
    }
}

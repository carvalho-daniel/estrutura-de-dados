import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();

        boolean esc = true;
        String op;
        int id;
        String titulo;

        while (esc) {

            System.out.println("- MENU -");
            System.out.println("1 - adicionar processo");
            System.out.println("2 - retirar processo");
            System.out.println("3 - imprimir fila");
            System.out.println("4 - localizar um processo");
            System.out.println("5 - limpar fila");
            System.out.println("6 - sair");
            op = sc.nextLine();

            switch (op) {
                case "1":
                    System.out.print("Código: ");
                    id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Título: ");
                    titulo = sc.nextLine();
               
                    try {
                        fila.enfileirar(new Processo(id, titulo));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        System.out.println(fila.desenfileirar());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("Fila: ");
                    try {
                        fila.imprimir();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "4":
                    System.out.print("Código: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    try {
                        Processo p = fila.busca(id);
                        System.out.println("Código: " + p.id + " - Título: " + p.titulo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "5":
                    try {
                        fila.limpaFila();
                        System.out.println("Fila limpa!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "6":
                    esc = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }


        }
        


        /* uns testes prontos caso queria usar */
        // try {
        //     fila.enfileirar(new Processo(1, "A"));
        //     fila.enfileirar(new Processo(2, "B"));
        //     fila.enfileirar(new Processo(3, "C"));
        //     fila.enfileirar(new Processo(4, "D"));
        //     fila.enfileirar(new Processo(5, "E"));

        //     fila.limpaFila();

        //     fila.enfileirar(new Processo(6, "f"));
        //     fila.enfileirar(new Processo(7, "g"));
        //     fila.enfileirar(new Processo(8, "h"));
        //     fila.enfileirar(new Processo(9, "i"));

        //     fila.imprimir();

        //     while(!fila.isVazia()) {
        //         System.out.println(fila.desenfileirar().titulo);
        //     }

        //     fila.limpaFila();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        sc.close();
    }
}
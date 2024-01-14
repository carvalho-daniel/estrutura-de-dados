import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filmes filme;
        String nome;
        String gen;
        String esc;
        int cod;
        int novoTam;
        boolean enq = true;

        while (enq) {
            System.out.println(" _____________________________________");
            System.out.println("|         #      FILMES     #         |");
            System.out.println("|-------------------------------------|");
            System.out.println("| 1 - Adicionar novo filme            |");
            System.out.println("| 2 - Listar todos os filmes          |");
            System.out.println("| 3 - Procurar filme                  |");
            System.out.println("| 4 - Excluir filme                   |");
            System.out.println("| 5 - Aumentar tamanho da lista       |");
            System.out.println("| 6 - Sair                            |");
            System.out.println("|_____________________________________|");
            
            esc = sc.nextLine();
            
            switch(esc) {
                case "1":
                    if (ListaFilmes.uPosicao == 20) {
                        System.out.println("A lista de filmes está cheia, exclua ou mude seu tamanho!");
                    } else {
                        System.out.println(" - ADICIONAR FILME - ");
                        System.out.print("Nome: ");
                        nome = sc.nextLine();

                        System.out.print("Código: ");
                        cod = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Gênero: ");
                        gen = sc.nextLine();

                        filme = new Filmes(cod, nome, gen);
                        try {
                            ListaFilmes.setFilme(filme);
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
        
                    }
                    
                    break;

                case "2":
                    ListaFilmes.verFilmes();
                    break;

                case "3":
                    System.out.println(" - PROCURAR FILME -");
                    System.out.print("Nome do filme: ");
                    nome = sc.nextLine();

                    ListaFilmes.procurar(nome);
                    break;

                case "4":
                    System.out.println(" - EXCLUIR FILME -");
                    System.out.print("Código do filme: ");
                    cod = sc.nextInt();
                    sc.nextLine();
                    ListaFilmes.deletar(cod);
                    break;

                case "5":
                    System.out.println(" - AUMENTAR TAMANHO DA LISTA - ");
                    System.out.println("obs: o tamanho deve ser maior do que a quantida de elementos da lista e maior que zero");
                    System.out.print("Novo tamanho: ");
                    
                    novoTam = sc.nextInt();
                    sc.nextLine();
                    
                    if (novoTam <= ListaFilmes.uPosicao || novoTam <= 0) {
                        System.out.println("!!!O tamanho deve ser maior do que a quantida de elementos da lista e maior que zero!!!");
                    } else {
                        ListaFilmes.aumentar(novoTam);
                    }
                    
                    break;

                case "6":
                    enq = false;
                    System.out.println("_ - saiu - _");
                    break;

                default:
                    System.out.println("Opcão inválida!");

            }
            
        }

        sc.close();
    }
}

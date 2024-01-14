import java.util.Scanner;

public class VetorNomes {

    private static String nomes[] = new String[10];
    private static int qtdCad = 0;
    private static int qtdVagas = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String esc;
        String nome;
        boolean enq = true;

        while (enq) {

            System.out.println(" _________________________________");
            System.out.println("|       @       MENU        @     |");
            System.out.println("|---------------------------------|");
            System.out.println("| 1 - Cadastrar convidado         |");
            System.out.println("| 2 - Excluir convidado           |");
            System.out.println("| 3 - Listar convidados           |");
            System.out.println("| 4 - Ver vagas restantes         |");
            System.out.println("| 5 - sair                        |");
            System.out.println("|_________________________________|");

            
            esc = sc.nextLine();
            
            switch (esc) {
                case "1":
                    System.out.println("OPÇÃO 1");

                    if (qtdCad == 9) {
                        System.out.println("Limite de convidados atingida!");
                    } else {
                        System.out.print("Nome do convidado: ");
                        nome = sc.nextLine();
                        add(nome);
                        qtdCad++;
                        qtdVagas--;
                    }
                    break;

                case "2":
                    System.out.println("OPÇÃO 2");
                    System.out.print("Digite o nome do convidado a ser excluído: ");
                    nome = sc.nextLine();
                    try {
                        delete(nome);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("OPÇÃO 3");
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null) {
                            System.out.println(nomes[i]);
                        }
                    }
                    break;

                case "4":
                    System.out.println("OPÇÃO 4");
                    System.out.println("Quantidade de vagas restantes: " + qtdVagas);
                    break;
                
                case "5":
                    enq = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
              
        }

        System.out.println("_- saiu -_");
        sc.close();

    }

    public static void add(String nome)  {

        if (qtdCad < 9) {
            nomes[qtdCad] = nome;
        }

    }

    public static void delete(String nome) throws Exception{
        int posicao = -1;

        for (int i = 0; i < qtdCad; i++) 
            if (nomes[i].equals(nome)) 
                posicao = i;
            
        if (posicao == -1) 
            throw new Exception("O nome que deseja excluir não está na lista! ");
        
        if (posicao == qtdCad) {
            qtdCad--;
            qtdVagas++;
            
        } else {
            for (int i = posicao; i < qtdCad; i++) {
                nomes[i] = nomes[i+1];
                
            }
            qtdVagas++;
            qtdCad--;
        }

    }
    
}

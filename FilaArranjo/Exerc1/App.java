import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        Fila fila = new Fila();
        String nomeAux;
        String esc;
        boolean enq = true;

        while (enq) {

            System.out.println("- MENU -");
            System.out.println("1 - solicitar senha");
            System.out.println("2 - solicitar atendimento");
            System.out.println("3 - sair");
            esc = sc.nextLine();

            switch (esc) {
                case "1":
                    System.out.print("Nome: ");
                    nomeAux = sc.nextLine();
                    try {
                        fila.enfileirar(nomeAux);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Pessoa a ser atendida: ");
                    try {
                        System.out.println(fila.desenfileirar());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "3":
                    enq = false;
                    break;
                default:
                    System.out.println("Opção inválida!");


            }

        } 

        sc.close();
    }
}
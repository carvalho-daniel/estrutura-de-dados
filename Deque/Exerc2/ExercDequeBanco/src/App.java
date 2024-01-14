import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Deque<Double> deque = new Deque<>();
        String esc;
        int numParcelas;
        double valor;
        double montante;
        double juros;
        double total = 0;
        
        System.out.println("-- BANCO IF --");
        System.out.print("Valor do financiamento: ");
        valor = sc.nextDouble();

        System.out.print("Número de parcelas: ");
        numParcelas = sc.nextInt();

        montante = valor/numParcelas;

        juros = montante*0.01;

        for (int i = 0; i < numParcelas; i++) {
            montante += juros;
            total += montante;
            deque.adicionaFinal(montante);
        }

        System.out.println("-- PAGAMENTO DAS PARCELAS --");
        while (true) {
            System.out.println("Total da dívida: " + total);

            System.out.println("Qual parcela deseja pagar?");
            System.out.println("1 - Primeira parcela");
            System.out.println("2 - Última parcela");
            esc = sc.nextLine();

            if (esc.equals("1")) {
                total -= deque.removeInicio();
            } else {
                total -= deque.removeFinal();
            }

            if (deque.isVazio()) {
                break;
            }

            System.out.println("Deseja pagar mais uma parcela?");
            System.out.println("1 - sim, 2 - não");
            esc = sc.nextLine();
            if (!esc.equals("1")) {
                break;
            }
        }
        
        sc.close();
    }
}

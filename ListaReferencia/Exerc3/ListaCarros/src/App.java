import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaDinamica lista = new ListaDinamica();
        String placa;
        String marca;
        String modelo;
        float valor;

        int esc;

        while (true) {
            System.out.println(" _______________________");
            System.out.println("|          MENU         |");
            System.out.println("|-----------------------|");
            System.out.println("| 1 - Adicionar carro   |");
            System.out.println("| 2 - Visualizar carros |");
            System.out.println("| 3 - Sair              |");
            System.out.println("|_______________________|");
            esc = sc.nextInt();

            if (esc == 3)
                break;
            
            if (esc == 1) {
                sc.nextLine();
                System.out.println("Adicionar carro");
                System.out.print("Placa: ");
                placa = sc.nextLine();

                System.out.print("Marca: ");
                marca = sc.nextLine();

                System.out.print("Modelo: ");
                modelo = sc.nextLine();

                System.out.print("Valor: ");
                valor = sc.nextFloat();
                
                lista.add(new Carros(placa, marca, modelo, valor));

            } else if (esc == 2) {
                System.out.println("--- Lista de carros ---");
                lista.imprimir();
            }

        }

        
        sc.close();
    }
}

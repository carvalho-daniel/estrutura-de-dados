import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        long resultado = 1;

        num = sc.nextInt();

        for (int i = num; i > 1; i--) {
            resultado *= i;
        }

        System.out.println(resultado);

        sc.close();
    }
}

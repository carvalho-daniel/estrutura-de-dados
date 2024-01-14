import java.util.Scanner;

public class Potencia {

    public static long potencia(int n) {

        if (n == 1) {
            return 2;
        } else {
            return 2*potencia(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        System.out.println("2^" + String.valueOf(n) + " = " + potencia(n));

        sc.close();
    }

}

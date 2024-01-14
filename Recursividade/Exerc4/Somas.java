import java.util.Scanner;

public class Somas {
    
    public static int soma(int n, int m) {

        if (m == 1) {
            return n;
        } else {
            m--;
            return n+soma(n, m);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(soma(num1, num2));

        sc.close();
    }

}

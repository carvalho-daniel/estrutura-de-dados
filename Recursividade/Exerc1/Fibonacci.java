import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 1;
        int num2 = 1;
        int num3;
        int soma = 0;
    
        num3 = sc.nextInt();

        for (int i = 1; i < num3; i++) {

            soma = num1 + num2;

            num1 = num2;
            num2 = soma;

        }

        System.out.println(soma);

        sc.close();

    }
}

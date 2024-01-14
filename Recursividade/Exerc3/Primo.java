import java.util.Scanner;

public class Primo {


    public static String primo(int n, int meioN) {

        if (meioN == 1) {
            return " e primo";
        } else {
            if (n%meioN == 0) {
                return " nao e primo";
            } else {
                meioN--;
                return primo(n, meioN);
            }
        }

    
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primoOuNao;

        primoOuNao = sc.nextInt();

        if (primoOuNao == 1) {
            System.out.println("1 não é primo");
        } else {
            System.out.println(primoOuNao + primo(primoOuNao, primoOuNao/2));   
        }

        
        sc.close();
    }
    
}

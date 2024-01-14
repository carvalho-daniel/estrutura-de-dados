import java.util.Scanner;

public class Mdc {
    
    public static int mdc(int x, int y) {

        if (x >= y && x%y == 0 ) {
            return y;
        } else {
            if (x<y) {
                return mdc(y, x);
            } else {
                return mdc(y, x%y); 
            }
            
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(mdc(num1, num2));

        sc.close();
    }

}

public class Exerc2 {

    public static boolean isThere(int[] vetor, int esc, int inicio, int ultimo) {
        
        
        if (inicio > ultimo) {
            return false;
        } 
        
        if (esc == vetor[(inicio+ultimo)/2]) {
            return true;
        }

        if (esc <= vetor[(inicio+ultimo)/2]) {
            return isThere(vetor, esc, 0, ((inicio+ultimo)/2)-1);
        } else {
            return isThere(vetor, esc, ((inicio+ultimo)/2)+1, ultimo);
        }
        
    }

    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int esc = 4;
        
        System.out.println(isThere(vetor, esc, 0, vetor.length-1));

    }

}

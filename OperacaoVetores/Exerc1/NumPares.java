import java.util.Random;

public class NumPares {

    public static int uPosicao = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];    

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50)+1;
        }


        System.out.println("");
        System.out.println("__________________________________________________________");
        System.out.println("");

        System.out.println("Vetor completo: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " - ");
        }

        System.out.println("");
        System.out.println("__________________________________________________________");
        System.out.println("");
    
                     
        
        vetor = excluir(vetor);
               

        System.out.println("Vetor sem pares: ");
        for (int i = 0; i < uPosicao; i++) {
            System.out.print(vetor[i] + " - ");
        }

        System.out.println("");
        System.out.println("__________________________________________________________");
        System.out.println("");

    }

    public static int[] excluir(int vetor[]) {

        for (int i = 0; i < uPosicao; i++) {

            if (vetor[i]%2 == 0) {
                for (int j = uPosicao-1; j >= i; --j) {
                    if (j == i) {
                        uPosicao = i;
                    }

                    if (vetor[j]%2 != 0) {                
                        vetor[i] = vetor[j];
                        uPosicao = j;              
                        break;
                    } 
                     
                }           
            }

        }

        if (vetor[uPosicao-1]%2 == 0) {
            --uPosicao;
        }

        return vetor;

    }

}

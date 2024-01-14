import java.util.Random;

public class Vetor100 {

    public static int uPosicao = 0;
    public static Random random = new Random();
    public static Random lugar = new Random();
    
    public static void main(String[] args) {

        int esc;
        int num;
        int vetor[] = new int[100];


        for (int i = 0; i < 100; i++) {
            esc = lugar.nextInt(3)+1;
            num = random.nextInt(100)+1;
            uPosicao = i;
            switch(esc) {

                case 1:

                    try {
                        vetor = inicioMeio(vetor, 0, num);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
               
                    break;

                case 2:
                    try {
                        vetor = inicioMeio(vetor, uPosicao, num);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        vetor = ultimo(vetor, num);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Erro");

            }

        }

        for (int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " - ");
        }


    }

    public static int[] inicioMeio(int vetor[], int posicao, int num) throws Exception {

        if (uPosicao == vetor.length-1) {
            throw new Exception("O vetor está cheio!");
        }

        if (posicao > uPosicao) {
            ultimo(vetor, num);
        } else {
            for (int i = uPosicao+1; i > posicao; --i) {
                vetor[i] = vetor[i-1];
            }
            vetor[posicao] = num;
            uPosicao++;

        }

        return vetor;

    }

    public static int[] ultimo(int vetor[], int num) throws Exception {

        if (uPosicao == vetor.length-1) {
            throw new Exception("O vetor está cheio!");
        }

        vetor[uPosicao+1] = num;
        uPosicao++;

        return vetor;

    }

}

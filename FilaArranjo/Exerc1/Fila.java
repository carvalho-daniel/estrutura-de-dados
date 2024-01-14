public class Fila {
    String vetor[] = new String[50];
    int tam = 0;


    public void enfileirar(String nome) throws Exception {
        if (tam == 50)
            throw new Exception("Fila cheia!");

        vetor[tam++] = nome;

    }

    public String desenfileirar() throws Exception {
        if (tam == 0) 
            throw new Exception("Fila vazia!");

        String aux = vetor[0];

        for (int i = 0; i < tam-1; i++) {
            vetor[i] = vetor[i+1];
        }
        tam--;
        return aux;
    }

    public void print() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " - ");
        }
    }

    public boolean isVazio() {
        return tam == 0;
    }

}

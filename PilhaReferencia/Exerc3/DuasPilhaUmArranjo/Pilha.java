public class Pilha {
    int vetor[] = new int[20];
    int top1 = 0;
    int top2 = vetor.length-1;
    int tam1 = 0;
    int tam2 = 0;

    public void push(int num, int vet) throws Exception {
        if (isCheio())
            throw new Exception("Vetor cheio!");

        if (vet == 1) {
            vetor[top1++] = num;
            tam1++;
        } else if (vet == 2) {
            vetor[top2--] = num;
            tam2++;
        } else {
            throw new Exception("Vetor inválido.");
        }
    }   

    public int pop(int vet) throws Exception {
        
        if (vet == 1) {
            if (tam1 == 0)
                throw new Exception("Vetor 1 vazio.");
            tam1--;
            return vetor[--top1];       
        } else if (vet == 2) {     
            if (tam2 == vetor.length)
                throw new Exception("Vetor 2 vazio.");   
            tam2--;
            return vetor[top2++];
        } else {
            throw new Exception("Vetor inválido.");
        }
    }

    public boolean isCheio() {
        return top1 > top2;
    }

    


}

public class Pilha {
    Numero num;
    Numero topo;
    int tam = 0;

    public Pilha() {
        push(1);
        push(1);
    }

    public void push(int n) {
        num = new Numero(n);

        num.prox = topo;
        topo = num;
        tam++;

    }

    public int pop() throws Exception {
        if (tam == 0)
            throw new Exception("Pilha vazia");

        Numero aux = topo;

        topo = topo.prox;

        tam--;
        return aux.num;
    }

    public boolean isVazia() {
        return tam == 0;
    }
}

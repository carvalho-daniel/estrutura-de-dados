public class No {
    public No anterior;
    public No proximo;
    public Carros carro;

    public No() {
        this.anterior = null;
        this.proximo = null;
        this.carro = null;
    }

    public No(No ant, No prox, Carros car) {
        this.anterior = ant;
        this.proximo = prox;
        this.carro = car;
    }
}

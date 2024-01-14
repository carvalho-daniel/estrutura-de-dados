public class No {
    public No proximo;
    public No anterior;
    public Cliente cliente;
    
    public No() {
        this.cliente = null;
        this.anterior = null;
        this.proximo = null;     
    }

    public No(Cliente cli, No ant, No prox) {
        this.cliente = cli;
        this.anterior = ant;
        this.proximo = prox;
    }

}
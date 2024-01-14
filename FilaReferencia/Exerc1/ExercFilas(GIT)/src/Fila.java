public class Fila <T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho = 0;

    public void enfileirar(T elemento)  {
        No<T> el = new No<T>(elemento);
        if (!isVazia()) {
            cauda.prox = el;
        } else {
            cabeca = el;
        }
        cauda = el;
        tamanho++;
    }

    public T desenfileirar() throws Exception {
        if (isVazia()) {
            throw new Exception("Fila vazia");
        }
        T el = cabeca.classe;
        cabeca = cabeca.prox;
        tamanho--;
        return el;
    }

    public boolean isVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}

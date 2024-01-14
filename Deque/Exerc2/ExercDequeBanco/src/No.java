public class No<T> {
    No<T> proximo;
    No<T> anterior;
    T classe;

    public No() {
        proximo = null;
        anterior = null;
        classe = null;
    }

    public No(T obj) {
        this.classe = obj;
    }
}

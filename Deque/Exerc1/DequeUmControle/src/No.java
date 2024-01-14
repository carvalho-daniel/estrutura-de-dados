public class No<T> {
    No<T> proximo;
    No<T> anterior;
    T classe;

    public No() {}
    
    public No(T classe) {
        this.classe = classe;
    }

    public T getClasse() {
        return this.classe;
    }
    
}

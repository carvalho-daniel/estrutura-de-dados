public class No <T> {
    T classe;
    No<T> prox;

    public No() {
        
    }

    public No(T obj) {
        this.classe = obj;
    }
}
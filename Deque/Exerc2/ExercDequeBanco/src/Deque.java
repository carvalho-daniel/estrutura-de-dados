public class Deque<T> {
    No<T> cabeca = new No<>();
    No<T> cauda = new No<>();
    No<T> elemento;
    int tam = 0;

    public void adicionaInicio(T obj) {
        elemento = new No<T>(obj);
        if (isVazio()) {
            cauda.anterior = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            elemento.proximo.anterior = elemento;
        }
        cabeca.proximo = elemento;
        tam++;
    }

    public T removeInicio() throws Exception {
        elemento = cabeca.proximo;
        if (isVazio()) 
            throw new Exception("Deque vazio!");

        if (tam == 1) {
            cabeca.proximo = null;
            cauda.anterior = null;
        } else {
            cabeca.proximo = cabeca.proximo.proximo;
            cabeca.proximo.anterior = null;
        }
        tam--;

        return elemento.classe;
    }

    public void adicionaFinal(T obj) {
        elemento = new No<T>(obj);
        if (isVazio()) {
            adicionaInicio(obj);;
        } else {
            cauda.anterior.proximo = elemento;
            elemento.anterior = cauda.anterior;
            cauda.anterior = elemento;
            tam++;
        }
    }

    public T removeFinal() throws Exception {
        elemento = cauda.anterior;
        if (isVazio())
            throw new Exception("Deque vazio!");
        if (tam == 1) {
            cabeca.proximo = null;
            cauda.anterior = null;
        } else {
            cauda.anterior = cauda.anterior.anterior;
            cauda.anterior.proximo = null;
        }
        tam--;
        return elemento.classe;
    }

    public boolean isVazio() {
        return tam == 0;
    }

    public void print() throws Exception {
        if (isVazio())  
            throw new Exception("Deque vazio!");

        No<T> el = cabeca.proximo;
        while (el != null) {
            System.out.println(el.classe.toString());
            el = el.proximo;
        }
    }

}
public class Deque<T> {
    No<T> cabeca = new No<>();
    No<T> elemento = new No<>();
    int tam = 0;

    public void adicionaInicio(T obj) {
        elemento = new No<T>(obj);
        if (isVazio()) {
            cabeca.anterior = elemento;     
        } else {
            elemento.proximo = cabeca.proximo; 
            elemento.proximo.anterior = elemento;    
        }
        cabeca.proximo = elemento;
        tam++;
    }

    public T removeInicio() throws Exception {
        if (isVazio()) 
            throw new Exception("Deque vazio!");

        elemento = cabeca.proximo;
        if (tam == 1) {
            cabeca.proximo = null;
            cabeca.anterior = null;
        } else {
            cabeca.proximo = cabeca.proximo.proximo;
            cabeca.proximo.anterior = cabeca;
        }
        tam--;
        return elemento.getClasse();
    }

    public void adicionaFinal(T obj) {
        if (isVazio()) {
            adicionaInicio(obj);
        } else {
            elemento = new No<T>(obj);
            cabeca.anterior.proximo = elemento;
            elemento.anterior = cabeca.anterior;
            cabeca.anterior = elemento;
            tam++;
        }
    }

    public T removeFinal() throws Exception{
        if (isVazio())  
            throw new Exception("Deque vazio!");
        elemento = cabeca.anterior;
        if (tam == 1) {
            cabeca.proximo = null;
            cabeca.anterior = null;
        } else {
            cabeca.anterior = cabeca.anterior.anterior;
            cabeca.anterior.proximo = null;
        }
        tam--;
        return elemento.getClasse();
        
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

    public void reverse() throws Exception {
        if (isVazio())  
            throw new Exception("Deque vazio!");

        No<T> el = cabeca.anterior;
        while (el != null) {
            System.out.println(el.classe.toString());
            el = el.anterior;
        }
    }

    public boolean isVazio() {
        return tam == 0;
    }
}

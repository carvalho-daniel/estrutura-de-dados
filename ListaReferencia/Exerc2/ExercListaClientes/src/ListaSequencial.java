public class ListaSequencial {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;
    
    private int tamanho = 0;


    public void addInicio(Cliente cli) {
        elemento = new No(cli, null, null);
        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            cabeca.proximo = elemento;
            elemento.proximo.anterior = elemento;
            
        }
        tamanho++;
    }

    public void addFinal(Cliente cli) {
        elemento = new No(cli, null, null);
        if (tamanho == 0) {
            addInicio(cli);
        } else {
            cauda.proximo = elemento;
            elemento.anterior = cauda;
            cauda = elemento;
            tamanho++;
        }



    }

    public void add(Cliente cli) {
        elemento = new No(cli, null, null);
        if (tamanho == 0) {
            addInicio(cli);
        } else {
            if (cli.codigo <= cabeca.proximo.cliente.codigo) {
                addInicio(cli);
            } else if (cli.codigo >= cauda.cliente.codigo) {
                addFinal(cli);
            } else {
                No aux = cabeca.proximo;
                while (aux.cliente.codigo <= cli.codigo) {
                    aux = aux.proximo;
                } 
                
                elemento.proximo = aux;
                elemento.anterior = aux.anterior;
                elemento.proximo.anterior = elemento;
                elemento.anterior.proximo = elemento;

                tamanho++;
            }
        }
    }

    public void imprimir() {
        No aux = cabeca.proximo;
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Código: " + aux.cliente.codigo);
            System.out.println("Nome: " + aux.cliente.nome);
            aux = aux.proximo;
        }
        System.out.println("Tamanho da lista: " + tamanho);
    }

}

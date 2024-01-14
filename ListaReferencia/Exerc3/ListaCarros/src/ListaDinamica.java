public class ListaDinamica {
    No cabeca = new No();
    No cauda = cabeca;
    No elemento;
    int tamanho = 0;

    public void addInicio(Carros car) {
        elemento = new No(null, null, car);
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

    public void addFinal(Carros car) {
        elemento = new No(null, null, car);
        if (tamanho == 0) {
            addInicio(car);
        } else {
            cauda.proximo = elemento;
            elemento.anterior = cauda;
            cauda = elemento;
            tamanho++;
        }
    }

    public void add(Carros car) {
        elemento = new No(null, null, car);
        if (tamanho == 0) {
            addInicio(car);
        } else {
            addFinal(car);
        }
    }

    public void imprimir() {
        No el = cabeca.proximo;
        for (int i = 1; i <= tamanho; i++) {
            System.out.println("Placa..: " + el.carro.getPlaca());
            System.out.println("Marca..: " + el.carro.getMarca());
            System.out.println("Modelo.: " + el.carro.getModelo());
            System.out.println("Valor..: " + el.carro.getValor());
            System.out.println();
            el = el.proximo;
        }
    }

}

public class Fila {
    Processo fila[] = new Processo[40];
    int tam = 0;

    public void enfileirar(Processo p) throws Exception {        
        if (tam == fila.length) 
            throw new Exception("Fila cheia!");

        fila[tam++] = p;
    }   

    public Processo desenfileirar() throws Exception {
        if (isVazia())
            throw new Exception("Fila vazia!");
        Processo aux = fila[0];

        for (int i = 0; i < tam-1; i++) {
            fila[i] = fila[i+1];
        }

        tam--;

        return aux;
    }

    public void imprimir() throws Exception {
        if (isVazia())
            throw new Exception("Fila vazia!");
        
        for (int i = 0; i < tam; i++) {
            System.out.println((i+1)+"º - " + "Código: " + fila[i].id + " - Título: " + fila[i].titulo);
        }

    }

    public Processo busca(int id) throws Exception {
        if (isVazia())
            throw new Exception("Fila vazia!");
        
        Processo p = new Processo();

        for (int i = 0; i < tam; i++) {
            if (id == fila[i].id)
                p = fila[i];
        }

        return p;
    }

    public void limpaFila() throws Exception {
        if (isVazia())
            throw new Exception("Fila vazia!");
        
        tam = 0;
        /*
         * se eu uso tamanho pra colocar na próxima possição vaga 
         * então quando eu mudar pra 0 a fila vai começar dnv :)
         */
    }

    public boolean isVazia() {
        return tam == 0;
    }
}

public class ListaFilmes {

    public static int uPosicao = 0;
    private static Filmes[] lista = new Filmes[20];
    private static Filmes[] listaAux; 

    public static void setFilme(Filmes filme) throws Exception{
        int i = 0;

        if (uPosicao == lista.length) 
            throw new Exception("O vetor está cheio!");

        if (uPosicao == 0) {
            lista[0] = filme;
        } else {
            for (i = uPosicao; i > 0; i--) {
                if (lista[i-1].getCodigo() > filme.getCodigo()) {
                    lista[i] = lista[i-1];
                } else {              
                    break;
                }
            }
            lista[i] = filme;    
            System.out.println("Filme adicionado com sucesso!");
        }
        uPosicao++;
    }

    public static Filmes[] getFilmes() {
        return lista;
    }

    public static void verFilmes() {
        for (int i = 0; i < uPosicao; i++) {
            System.out.println("Filme " + lista[i].getCodigo() + " nome: " + lista[i].getNome() + " gênero: " + lista[i].getGenero());
        }
    }

    public static void aumentar(int tam) {
        if (uPosicao == 0) {
            lista = new Filmes[tam];
        } else {
            listaAux = new Filmes[tam];
            for (int i = 0; i < uPosicao; i++) {
                listaAux[i] = lista[i];
            }
            lista = listaAux;
            System.out.println("Novo tamanho do vetor: " + lista.length);
        }

        
    }

    public static void deletar(int cod) {
        boolean ex = false;
        for (int i = 0; i < uPosicao; i++) {
            if (lista[i].getCodigo() == cod) {
                for (int j = i; j < uPosicao; j++) {
                    lista[j] = lista[j+1];
                    
                }
                uPosicao--;
                ex = true;
            }
        }

        if (!ex) {
            System.out.println("Filme não encontrado ou não existe !");
        } else {
            System.out.println("Filme deletado com sucesso!");
        }
        
    }

    public static void procurar(String nome) {
        boolean ex = false;
        for (int i = 0; i < uPosicao; i++) {
            if (lista[i].getNome().equals(nome)) {
                System.out.println("Filme " + lista[i].getCodigo() + " nome: " + lista[i].getNome());
                ex = true;
                break;
            }
        }

        if (!ex) {
            System.out.println("Filme não encontrado ou não existe !");
        } 
    }
    
}

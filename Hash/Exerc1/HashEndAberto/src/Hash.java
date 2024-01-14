public class Hash {
    public static final int M = 13;
    private Livro vetor[];
    int tam = 0;

    public Hash() {
        vetor = new Livro[M];
    }

    private int hash (String chave) {
        int h = 0;
        for (int i = 0; i < chave.length(); i++) {
            h = (31 * h + chave.charAt(i)) % M;
        }
        return h;
    }

    public void put(Livro l) throws Exception {
        if (tam == vetor.length-1)
            throw new Exception("Vetor cheio");
        
        int salto;
        int hash;

        for (salto = 0; salto < vetor.length; salto++) {
            hash = (hash(l.getISBN()) + salto) % vetor.length ;

            if ((vetor[hash] == null) || (vetor[hash].getISBN().equals(l.getISBN())) ) {
                vetor[hash] = l;
                tam++;
                break;
            }

        }

        if (salto == vetor.length) 
            throw new Exception("Vetor cheio");

    }

    public Livro get(String chave) throws Exception {
        if (tam == 0)
            throw new Exception("Vetor vazio");

        int salto;
        int hash;

        for (salto = 0; salto < vetor.length; salto++) {
            hash = (hash(chave) + salto) % vetor.length;
            if (vetor[hash] != null) {
                if (vetor[hash].getISBN().equals(chave)) {
                    return vetor[hash];
                }
            }
        }

        return null;
    }

    public Livro remove(String chave) throws Exception {
        if (tam == 0)
            throw new Exception("Vetor vazio");

        int salto;
        int hash;
        Livro obj = null;

        for (salto = 0; salto < vetor.length; salto++) {
            hash = (hash(chave) + salto) % vetor.length;
            if (vetor[hash] != null) {
                if (vetor[hash].getISBN().equals(chave)) {
                    obj = vetor[hash];
                    vetor[hash] = null;
                    tam--;
                    break;
                }
            }
        }

        return obj;

    }

    public void print() throws Exception {
        if (tam == 0)
            throw new Exception("Vetor vazio!");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println();
                System.out.println(vetor[i].getISBN());
                System.out.println(vetor[i].getTitulo());
                System.out.println(vetor[i].getAutor());
                System.out.println("________________________");
            }  
        }
    }
    

}

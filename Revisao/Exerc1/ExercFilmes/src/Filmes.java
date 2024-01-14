public class Filmes {
    
    private int codigo;
    private String nome;
    private String genero;

    public Filmes() {}

    public Filmes(int cod, String nome, String gen) {
        setCodigo(cod);
        setNome(nome);
        setGenero(gen);
    }

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGenero(String gen) {
        this.genero = gen;
    }

    public String getGenero() {
        return this.genero;
    }

    

}

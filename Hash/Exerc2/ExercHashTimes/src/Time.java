public class Time {
    private String codigo;
    private String nome;
    private int anoFundacao;
    private String presidente;
    private String tecnico;

    public Time() {}

    public Time(String c, String n, int a, String p, String t) {
        setCodigo(c);
        setNome(n);
        setAnoFundacao(a);
        setPresidente(p);
        setTecnico(t);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Time [codigo=" + codigo + ", nome=" + nome + ", anoFundacao=" + anoFundacao + ", presidente="
                + presidente + ", tecnico=" + tecnico + "]";
    }

    

}

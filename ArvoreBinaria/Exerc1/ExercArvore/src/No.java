public class No {
    long matricula;
    String nome;
    String curso;
    No esquerda;
    No direita;

    public No() {}

    // construtor de teste
    public No(long m) {
        matricula = m;
    }

    public No(long m, String n, String c) {
        matricula = m;
        nome = n;
        curso = c;
    }

}
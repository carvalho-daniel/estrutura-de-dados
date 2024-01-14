public class Arvore {
    No raiz;
    public void inserir (No no, long matricula, String nome, String curso) {
        if (no != null) {
            if (matricula < no.matricula) {
                if (no.esquerda != null)
                    inserir(no.esquerda, matricula, nome, curso);
                else 
                    no.esquerda = new No(matricula, nome, curso);
            } else {
                if (no.direita != null)
                    inserir(no.direita, matricula, nome, curso);
                else 
                    no.direita = new No(matricula, nome, curso);
            }
        } else {
            raiz = new No(matricula, nome, curso);
        }
    }

    public No maior(No no) throws Exception {
        if (no == null)
            throw new Exception("Raiz nula!");
        if (no.direita != null)
            return maior(no.direita);
        else
            return no;
    }

    public No busca(No no, long mat) throws Exception {
        if (no == null)
            throw new Exception("Aluno não encontrado!");
        
        if (this.raiz == null)
            throw new Exception("Raiz vazia!");
        else {
            if (mat == no.matricula) 
                return no;
            else if (no.matricula < mat) 
                busca(no.direita, mat);
            else
                busca(no.esquerda, mat);
        }
        return no;
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.println(no.matricula + " - " + no.nome + " - " + no.curso);
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public No remove(long mat) throws Exception {
        return remove(this.raiz, mat);
    }

    public No remove(No no, long mat) throws Exception {
        boolean ajuste = false;
        if (no == null)
            throw new Exception("Aluno não encontrado!");

        if (this.raiz == null)
            throw new Exception("Raiz vazia!");
        else {
            if (mat < no.matricula) {
                no.esquerda = remove(no.esquerda, mat);
            } else if (mat > no.matricula) {
                no.direita = remove(no.direita, mat);
            } else {
                if (no.esquerda != null && no.direita != null) {
                    no.matricula = menor(no.direita).matricula;
                    no.nome = menor(no.direita).nome;
                    no.curso = menor(no.direita).curso;

                    no.direita = removeMenor(no.direita);
                } else {
                    if (no == raiz)
                        ajuste = true;
                    
                    no = (no.esquerda != null) ? no.esquerda : no.direita;
                    
                    if (ajuste)
                        raiz = no;
                }
            }
        }
        return no;
    }

    private No menor(No no) throws Exception {
        if (no == null)
            throw new Exception("Raiz vazia!");
        if (no.esquerda != null)
            return menor(no.esquerda);
        else
            return no;
    }

    private No removeMenor(No no) throws Exception {
        if (no == null)
            throw new Exception("Raiz nula");
        else {
            if (no.esquerda != null) {
                no.esquerda = removeMenor(no.esquerda);
                return no;
            } else {
                return no.direita;
            }
        }
    }

}

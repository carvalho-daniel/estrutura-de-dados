public class Pilha {
    static final int MAX = 100;
    Processo[] pilha = new Processo[MAX];

    Processo[] rosi = new Processo[MAX];
    Processo[] afon = new Processo[MAX];
    Processo[] ana = new Processo[MAX];

    int topo = -1;
    int topoRO = -1;
    int topoAF = -1;
    int topoAN = -1;

    public boolean isVazia() {
        return topo == -1;
    }

    public boolean isRO() {
        return topoRO == -1;
    }

    public boolean isAF() {
        return topoAF == -1;
    }

    public boolean isAN() {
        return topoAN == -1;
    }

    public int getTamanho() {
        return topo+1;
    }

    public void push(Processo p) throws Exception {
        if (topo == MAX-1) {
            throw new Exception("Não há espaço disponível!");
        }
        pilha[++topo] = p;
    }

    public Processo pop() throws Exception {
        if (isVazia()) {
            throw new Exception("Lista vazia");
        }
        return pilha[topo--];
    }

    public Processo popRO() throws Exception {
        if (isRO()) {
            throw new Exception("Lista de Rosimeire vazia");
        }
        return rosi[topoRO--];
    }

    public Processo popAF() throws Exception {
        if (isAF()) {
            throw new Exception("Lista de Afonso vazia");
        }
        return afon[topoAF--];
    }

    public Processo popAN() throws Exception {
        if (isAN()) {
            throw new Exception("Lista de Ana vazia");
        }
        return ana[topoAN--];
    }

    public void pushIDV(Processo p) throws Exception {
        if ((topoRO == MAX-1)) {
            throw new Exception("Pilha vazia");
        }

        if ((topoAF == MAX-1)) {
            throw new Exception("Pilha vazia");
        }

        if ((topoAN == MAX-1)) {
            throw new Exception("Pilha vazia");
        }

        if (p.responsavel.equals("Rosimeire")) {
            rosi[++topoRO] = p;

        } else if (p.responsavel.equals("Afonso")){ 
            afon[++topoAF] = p;

        } else if (p.responsavel.equals("Ana")) {
            ana[++topoAN] = p;
        
        }          
   
       
    }

    public int posicao(int p) {
        int posicao = -1;    
          
        for (int i = topoRO; i >= 0; i--) {
            if (rosi[i].codigo == p) {
                return posicao = i;
            }
        }
    
        for (int i = topoAF; i >= 0; i--) {
            if (afon[i].codigo == p) {
                return posicao = i;              
            }
        }
    
        for (int i = topoAN; i >= 0; i--) {
            if (ana[i].codigo == p) {
                return posicao = i;        
            }
        }   

        return posicao;
    } 


}
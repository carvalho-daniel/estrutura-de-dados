public class PilhaReferencia {
    Carta topoJ1;
    Carta topoJ2;

    int tamJ1 = 0;
    int tamJ2 = 0;

    int somaJ1 = 0;
    int somaJ2 = 0;

    public boolean isVaziaJ1() {
        return tamJ1 == 0;
    }

    public boolean isVaziaJ2() {
        return tamJ2 == 0;
    }

    public int totalJ1() {
        return somaJ1;
    }

    public int totalJ2() {
        return somaJ2;
    }

    public boolean push(Carta c, int pilha) {
        if (pilha == 1) {    
            if ((somaJ1 + c.carta) >= 21) {
                somaJ1 -= 5;
                return false;
            } else {
                somaJ1 += c.carta;
                if (tamJ1 != 0) 
                    c.prox = topoJ1;
                
                topoJ1 = c;
                tamJ1++;
                return true;
            }
        } else {          
            if ((somaJ2 + c.carta) >= 21) {
                somaJ2 -= 5;
                return false;
            } else {
                somaJ2 += c.carta;
                if (tamJ2 != 0)
                    c.prox = topoJ2;
                
                topoJ2 = c;
                tamJ2++;
                return true;
            }
        }
    }

    public int pop(int pilha) throws Exception{
        if (pilha == 1) {
            if (tamJ1 == 0) 
                throw new Exception("Jogador 1 não possui cartas!");
            
            Carta c = topoJ1;
            topoJ1 = topoJ1.prox;
            --tamJ1;
            return c.carta;
        } else {
            if (tamJ2 == 0) 
                throw new Exception("Jogador 1 não possui cartas!");
            
            Carta c = topoJ2;
            topoJ2 = topoJ2.prox;
            --tamJ2;          
            return c.carta;
        }
    }

}

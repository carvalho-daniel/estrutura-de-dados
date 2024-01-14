import java.util.ArrayList;
import java.util.Iterator;

public class Hash {
    public static final int M = 17;
    private ArrayList<Time>[] tabela;

    public Hash() {
        tabela = (ArrayList<Time>[]) new ArrayList[M];
    }

    private int hash (String codigo) {
        int h = 0;
        for (int i = 0; i < codigo.length(); ++i) {
            h = (31 * h + codigo.charAt(i)) % M;
        }
        return h;
    }

    public void put(Time t) {
        int hash = hash(t.getCodigo());
        ArrayList<Time> times = tabela[hash];
        if (times == null) {
            times = new ArrayList<Time>();
            times.add(t);
            tabela[hash] = times;
        } else {
            boolean existe = false;
            for (Time time : times) {
                if (time.getCodigo().equals(t.getCodigo())) {
                    existe = true;
                }
            }
            if (!existe)
                times.add(t);
        }

    }

    public Time get(String codigo) {
        int hash = hash(codigo);
        ArrayList<Time> times = tabela[hash];
        if (times == null)
            return null;
        for (Time time : times) 
            if (time.getCodigo().equals(codigo))
                return time;
        return null;
    }

    public Time remove(String codigo) {
        int hash = hash(codigo);
        ArrayList<Time> times = tabela[hash];

        Iterator<Time> it = times.iterator();
        Time atual;
        
        while (it.hasNext()) {
            atual = it.next();
            if (atual.getCodigo().equals(codigo)) {
                it.remove();
                return atual;
            }
        }

        return null;
    }

    public void status() {
        for (int i = 0; i < M; ++i) {
            if (tabela[i] != null) {
                ArrayList<Time> times = tabela[i];
                System.out.printf("A posição %d possui %d times. \n", i, times.size());
            } else {
                System.out.printf("A posição %d não possui nenhum time, \n", i);
            }

        }
    }

}

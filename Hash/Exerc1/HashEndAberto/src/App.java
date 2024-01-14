import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Livro obj;
        String esc;
        Hash ht = new Hash();
        ht.put(new Livro("978-0-7334-2609-4","A volta","Lobão",1200));
        ht.put(new Livro("378-0-7334-2609-4","A ida","Lobão",1200));
        
        ht.put(new Livro("178-0-7234-2609-4","Sentirei saudades","Lobão",1200));
        ht.put(new Livro("278-0-7234-2609-4","Voltei","Lobão",1200));
        ht.put(new Livro("478-0-7234-2609-4","Democracia","Lobão",1200));
        ht.put(new Livro("578-0-7234-2609-4","O grito","Lobão",1200));
        ht.put(new Livro("678-0-7234-2609-4","O silêncio","Lobão",1200));
        ht.put(new Livro("778-0-7234-2609-4","Gelo derretendo","Lobão",1200));
        ht.put(new Livro("878-0-7234-2609-4","O crime","Lobão",1200));
        ht.put(new Livro("918-0-7234-2609-4","O julgamento","Lobão",1200));
        ht.put(new Livro("978-0-7234-2609-4","Não volto","Lobão",1200));
        
        ht.print();

        System.out.print("Livro ISBN: ");
        esc = sc.nextLine();

        obj = ht.get(esc);

        if (obj != null) {
            System.out.println(obj.getTitulo()); 
        } else {
            System.out.println("Não foi possível encontrar o livro!");
        }

        System.out.print("Remove: ");
        esc = sc.nextLine();

        obj = ht.remove(esc);

        if (obj != null) {
            System.out.println(obj.getTitulo());
        } else {
            System.out.println("Não foi possível encontrar o livro!");
        }

        ht.print();

        sc.close();
    }
}

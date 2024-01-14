public class App {
    public static void main(String[] args) throws Exception {
        ListaSequencial lista = new ListaSequencial();
        try {
            lista.add(new Cliente(4, "Beltranho", 0));
            lista.add(new Cliente(1, "Fulano", 1));                                         
            lista.add(new Cliente(2, "Fulano 2", 9));
            lista.add(new Cliente(0, "Ciclano", 0));
            lista.add(new Cliente(6, "Teste", 0));
            lista.add(new Cliente(5, "Beltranho", 0));
            lista.add(new Cliente(3, "teste", 0));
        } catch (Exception e) { 
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("_______________");
        lista.imprimir();
    }
}

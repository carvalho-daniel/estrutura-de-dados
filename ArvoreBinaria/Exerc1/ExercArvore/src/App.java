public class App {
    public static void main(String[] args) {
        Arvore bst = new Arvore();
        bst.inserir(bst.raiz, 20, "Abc Lopes", "SI");
        bst.inserir(bst.raiz, 10, "Açafrão Fagundes", "SI");
        bst.inserir(bst.raiz, 11, "Bandeirante Brasileiro Paulistano", "SI");
        bst.inserir(bst.raiz, 65, "Bemvindo o Dia do meu Nascimento Cardoso", "SI");
        bst.inserir(bst.raiz, 26, "Bestilde Mota Medeiros", "SI");
        bst.inserir(bst.raiz, 31, "Bizarro Assada", "AGRO");
        bst.inserir(bst.raiz, 35, "Brilhantina Muratori Cafiaspirina Cruz", "AGRO");
        bst.inserir(bst.raiz, 89, "Céu Azul do Céu Poente", "AGRO");
        bst.inserir(bst.raiz, 13, "Dezêncio da Ordem Imperial do Cruzeiro", "AGRO");
        bst.inserir(bst.raiz, 28, "Domingão Sabatino Gomes", "AGRO");

        try {
            if (bst.busca(bst.raiz, 32) != null) {
                System.out.println("Aluno encontrado.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bst.remove(89);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        bst.preOrdem(bst.raiz);
        
    }
}

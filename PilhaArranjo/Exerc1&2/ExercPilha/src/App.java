public class App {
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Processo proc = new Processo();

        try {
            p.push(new Processo(1, "Rosimeire", "Acme"));
            p.push(new Processo(2, "Afonso", "Samsung"));
            p.push(new Processo(3, "Rosimeire", "Lenovo"));
            p.push(new Processo(4, "Ana", "Lenovo"));
            p.push(new Processo(5, "Afonso", "Acme"));
            p.push(new Processo(6, "Rosimeire", "Lenovo"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while (!p.isVazia()) {
            try {
                p.pushIDV(p.pop());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        
        System.out.println("Procurar processo");
        try {
            int posicao = p.posicao(7)+1;
            if (posicao == 0) {
                System.out.println("Processo não encontrado ou não existe");
            } else {
                System.out.println("Posicao: " + posicao);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        System.out.println("Pilha Rosimeire: ");
        while (!p.isRO()) {
            try {
                proc = p.popRO();
                System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n", proc.responsavel, proc.codigo, proc.cliente);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Pilha Afonso: ");
        while (!p.isAF()) {
            try {
                proc = p.popAF();
                System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n", proc.responsavel, proc.codigo, proc.cliente);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Pilha Ana: ");
        while (!p.isAN()) {
            try {
                proc = p.popAN();
                System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n", proc.responsavel, proc.codigo, proc.cliente);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        

    }

}

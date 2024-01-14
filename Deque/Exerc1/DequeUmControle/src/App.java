public class App {
    public static void main(String[] args) throws Exception {
        Deque<Integer> deque = new Deque<>();
        deque.adicionaInicio(1);
        deque.adicionaInicio(3);
        deque.adicionaInicio(4);
        deque.adicionaFinal(2);
        deque.adicionaFinal(3);

        System.out.println("Normal");
        deque.print();

        System.out.println("Reverso");
        deque.reverse();

    }
}

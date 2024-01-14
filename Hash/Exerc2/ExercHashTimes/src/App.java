public class App {
    public static void main(String[] args) throws Exception {
        Hash tabela = new Hash();
        tabela.put(new Time("1", "Gigante Corinthians", 0, "Augusto Melo", "demonio de calça"));
        tabela.put(new Time("2", "Botagofo", 0, "", ""));
        tabela.put(new Time("3", "pequeno palmeirinhas", 0, "", ""));
        tabela.put(new Time("4", "little sao paulinho", 0, "", ""));
        tabela.put(new Time("5", "Vasco", 0, "", ""));
        tabela.put(new Time("6", "Fluminense", 0, "", ""));
        tabela.put(new Time("7", "Chapecoense", 0, "", ""));
        tabela.put(new Time("8", "Ponte Preta", 0, "", ""));
        tabela.put(new Time("9", "Red Bull kkkkk", 0, "", ""));
        tabela.put(new Time("10", "Athlethicho Mineiro", 0, "", ""));
        tabela.put(new Time("11", "cruzeirinho da silva", 0, "", ""));
        tabela.put(new Time("12", "Goias", 0, "", ""));
        tabela.put(new Time("13", "Gremio", 0, "", ""));
        tabela.put(new Time("14", "Cuiaba", 0, "", ""));

        tabela.status();
        Time t = tabela.remove("8");
        System.out.println(t.getNome());

        t = tabela.get("9");
        System.out.println(t.getNome());
    }
}

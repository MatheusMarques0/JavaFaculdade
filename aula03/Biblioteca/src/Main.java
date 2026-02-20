public class Main {
    public static void main(String[] args) {
        Biblioteca StarWars = new Biblioteca("Estrela da morte", "George Lucas", 10, 100.00);

        Biblioteca senhorDosAneis = new Biblioteca("A sociedade do Anel", "J.J.R Tolkien", 50, 50.00);

        StarWars.exibirInformaces();
        senhorDosAneis.exibirInformaces();
    }
}
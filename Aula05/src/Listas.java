import java.util.ArrayList;

public class Listas {
    public static void main(String[] arg) {
        ArrayList<String> Chaves = new ArrayList<>();

        Chaves.add("Quico");
        Chaves.add("Chaves");
        Chaves.add("Chapolin");

        System.out.println(Chaves);

        //Adiconar valores em uma posicao especifca
        Chaves.add(2, "Dona Florinda");
        System.out.println(Chaves);

        //Verificando o tamanho da Lista
        System.out.println("O tamanho da lista é: " + Chaves.size());

        //Acessar uum elemeto da lista
        System.out.println("A primeira posição tem o valor: " + Chaves.get(0));

        //Alterando valores
        Chaves.set(3, "Seu Madruga");
        System.out.println(Chaves);

        //Removendo um item
        Chaves.remove(2);
        System.out.println(Chaves);

        //Removendo item com Condições
        Chaves.removeIf(element -> element == "Quico");
        System.out.println(Chaves);

    }
}
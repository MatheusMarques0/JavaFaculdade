public class Vetores {
    public static void main(String[] args) {
        String[] Nomes = new String[10];

        Nomes[0] = "Matheus";
        Nomes[1] = "Miguel";
        Nomes[2] = "Mathias";
        Nomes[3] = "Maria";
        Nomes[4] = "Marcos";
        Nomes[5] = "Murilo";

        //  Método Tradicional
        //  for (int i = 0; i < Nomes.length; i++){
        //      System.out.println(Nomes[i]);
        //  }



        //ForEach
        for(String pessoas: Nomes){
            System.out.println(pessoas);
        }

    }
}
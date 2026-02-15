import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Carros hb20 = new Carros();
        hb20.marca = "Hyundai";
        hb20.modelo = "HB20 1.0 TGDI FLEX PLATINUM AUTOMÁTICO";
        hb20.ano = 2026;
        hb20.exibirinformacoes();

        Scanner sc = new Scanner(System.in);
        Carros carro = new Carros();
        System.out.print("Digite a marca do carro: ");
        carro.marca = sc.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro.ano = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o modelo do carro: ");
        carro.modelo = sc.nextLine();

        carro.exibirinformacoes();

    }
}
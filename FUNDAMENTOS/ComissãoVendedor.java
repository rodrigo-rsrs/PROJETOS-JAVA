import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor das vendas: ");
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;

        System.out.printf("Comissão: R$ %.2f%n", comissao);

        scanner.close();
    }
}

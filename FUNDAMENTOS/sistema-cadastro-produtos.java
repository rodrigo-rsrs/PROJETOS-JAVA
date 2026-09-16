import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double total = 0;
        double maiorPreco = 0;
        int indiceMaior = 0;

        String[] nomes = new String[5];
        double[] precos = new double[5];
        int[] quantidades = new int[5];

        System.out.println("=================================");
        System.out.println("SISTEMA DE CADASTRO");
        System.out.println("=================================");

        while (contador < 5) {
            System.out.println("Informe o nome dos produtos: ");
            nomes[contador] = sc.nextLine();

            System.out.println("Informe o preco dos produtos: ");
            precos[contador] = sc.nextDouble();

            System.out.println("Informe a quantidade: ");
            quantidades[contador] = sc.nextInt();

            sc.nextLine();
            contador++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Preço: " + precos[i]);
            System.out.println("Quantidade: " + quantidades[i]);
        }

        for (int i = 0; i < 5; i++) {
            total = total + (precos[i] * quantidades[i]);
        }

        System.out.println("Valor total do estoque: R$ " + total);

        for (int i = 0; i < 5; i++) {
            if (precos[i] > maiorPreco) {
                maiorPreco = precos[i];
                indiceMaior = i;
            }
        }

        System.out.println("Produto mais caro: " + nomes[indiceMaior]);
        System.out.println("Maior preco: " + maiorPreco);

        System.out.println("=================================");
        System.out.println("FIM DO PROGRAMA!");
        System.out.println("=================================");
    }
}

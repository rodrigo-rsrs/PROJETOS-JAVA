import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        while (contador < 20) {

            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a média do aluno: ");
            double media = scanner.nextDouble();

            scanner.nextLine();

            if (media >= 8) {
                System.out.println(nome + " - Aprovado");
            } else {
                System.out.println(nome + " - Reprovado");
            }

            contador++;
        }

        scanner.close();
    }
}

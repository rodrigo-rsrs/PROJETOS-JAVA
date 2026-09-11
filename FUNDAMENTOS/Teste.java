import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============");
        System.out.println("TESTES");
        System.out.println("==============");

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual curso você faz?");
        String curso = scanner.nextLine();

        System.out.println("\n===== DADOS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        }

        scanner.close();
    }
}

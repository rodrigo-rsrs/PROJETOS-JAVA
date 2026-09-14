import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;
        int quantidadeImpares = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
                quantidadeImpares++;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);

        if (quantidadeImpares > 0) {
            double mediaImpares = (double) somaImpares / quantidadeImpares;
            System.out.println("Média dos ímpares: " + mediaImpares);
        } else {
            System.out.println("Não foram digitados números ímpares.");
        }

        scanner.close();
    }
}

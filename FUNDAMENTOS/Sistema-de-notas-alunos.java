import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double soma = 0;
        double media = 0;
        double maiorNota = notas[0];
        double menorNota = notad[0];
        int aprovados = 0;
        int reprovados = 0;
        int indiceMenor = 0;
        int indiceMaior = 0;

        String[] nomes = new String[5];
        double[] notas = new double[5];

        while (contador < 5) {
            System.out.println("Digite o nome dos  alunos: ");
            nomes[contador] = sc.nextLine();

            System.out.println("Informe a nota dos alunos: ");
            notas[contador] = sc.nextDouble();
            sc.nextLine();

            soma += notas[contador];
            contador++;
        }

        media = soma / nomes.length;
        menorNota = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                indiceMaior = i;
            }

            if (notas[i] < menorNota) {
                menorNota = notas[i];
                indiceMenor = i;
            }

            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno: " + nomes[i] + " | " + "Nota: " + notas[i]);
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota + " | Aluno: " + nomes[indiceMaior]);
        System.out.println("Menor nota: " + menorNota + " | Aluno: " + nomes[indiceMenor]);

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);
    }
}

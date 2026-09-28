public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println(
            "Olá, me chamo " + nome +
            ", tenho " + idade +
            " anos e tenho " + altura + "m de altura."
        );
    }
}

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Rodrigo", 19, 1.87);

        p.apresentar();
    }
}

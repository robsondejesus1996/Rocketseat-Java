package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.cpf = "333222111";
        pessoa1.nome = "Robson";
        pessoa1.idade = 27;

        Pessoa pessoa2 = new Pessoa();

        pessoa2.cpf = "85425496";
        pessoa2.nome = "Maria";
        pessoa2.idade = 53;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));
        System.out.println(pessoa2.imprimirDadosDaPessoa(2));
    }
}

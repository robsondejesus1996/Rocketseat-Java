package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setCpf("333222111");
        professor.setNome("Robson");
        professor.setIdade(27);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("222222");
        aluno.setIdade(19);
        aluno.setNome("Fernada");
        aluno.setMatricula("8989898989");

        System.out.println(aluno.imprimirDadosDaPessoa());

    }
}

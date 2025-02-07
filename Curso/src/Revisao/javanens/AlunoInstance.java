package Revisao.javanens;

public class AlunoInstance {

    public static void main(String[] args) {
        Aluno robson = new Aluno();

        robson.setNome("Robson");
        robson.setIdade(28);

        System.out.println(robson.getNome() + " tem " + robson.getIdade() + " anos de idade");
    }
}

package operadores;

public class Atribuicoes {

    public static void main(String[] args) {
        String nome = "Robson " + "De Jesus";
        int idade = 22;
        double peso = 68.8;
        char sexo = 'M';
        boolean maiorDeIdade = true;

        String nome2 = 1 + 1 + "Robson";

        System.out.println(nome2);

        int numero = 1 + 1 * 2;
        System.out.println(numero);


        boolean bol = 1 > 2;
        System.out.println(bol);
    }
}

package operadores;

public class Ternario {

    public static void main(String[] args) {

        String nome = "Iza";
        int idade = 19;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " É MAIOR" : " NÃO É MAIOR");
        System.out.println(mensagem);

        if(idade > MAIOR_IDADE){
            System.out.println(nome + " É DE MAIOR");;
        }else{
            System.out.println(nome + " não é DE MAIOR");;
        }

    }
}

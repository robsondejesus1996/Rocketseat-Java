package Revisao.operadores;

public class Ternario {

    public static void main(String[] args) {
        String nome = "Iza";;
        int idade = 17;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " é de maior" : " Não é de maior");
        System.out.println(mensagem);


        if(idade >= MAIOR_IDADE){
            System.out.println(nome + " é de maior");
        }else{
            System.out.println(nome + " não é de maior");
        }
    }
}

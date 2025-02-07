package Revisao.operadores;

import java.util.Date;

public class operadores {
    public static void main(String[] args) {
        String nome = "Robson".concat(" de Jesus");
        int idade = 22;
        double peso = 79.9;
        char sexo = 'm';
        boolean maiorIdade = true;
        Date dataNascimento = new Date();

        System.out.println("Nome: " + nome);

        int numero = 1 + 1 *2;
        System.out.println(numero);
        boolean bold = (1 > 2);
        System.out.println(bold);
    }
}

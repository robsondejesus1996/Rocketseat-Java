package Revisao.excecoes;

import java.util.Scanner;

public class Execoes {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        try{
            System.out.println("Digite seu nome: ");
            String nome = entrada.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = entrada.nextInt();

            System.out.println("Bem vindo "+ nome);
            System.out.println(nome + " tem " + idade + " anos");

        }catch (Exception e){
            System.out.println("Problema de dados: "+e);

        }
    }
}

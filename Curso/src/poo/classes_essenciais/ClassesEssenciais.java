package poo.classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
//        try{
//            System.out.println("Dividingo 1/0");
//            System.out.println(1/0);
//        }catch (Exception e){
//            System.err.print("House um erro na tentativa de divisão");
//        }

        Scanner scan = new Scanner(System.in);;
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idade = scan.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
    }
}

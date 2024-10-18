package Execoes;

import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("Digite o seu nome: ");
            String nome = entrada.nextLine();


            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = entrada.nextLine();

            System.out.println("Digite a seu idade: ");
            int idade = entrada.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = entrada.nextDouble();


            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha Altura é " + altura + " cm");
            entrada.close();

        }catch (Exception ex){
            System.out.println("House um erro ao informar alguma informação " + ex);
        }
    }
}

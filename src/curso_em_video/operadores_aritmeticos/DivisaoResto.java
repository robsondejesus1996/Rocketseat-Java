package curso_em_video.operadores_aritmeticos;

import java.util.Scanner;

public class DivisaoResto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o numerador: ");
        int numerador = entrada.nextInt();
        System.out.println("Informe o denominador: ");
        int denominador = entrada.nextInt();

        int resto = numerador%denominador;
        int divisao = numerador/denominador;

        System.out.println("O numerador: " + numerador);
        System.out.println("O denominador: " + denominador);

        System.out.println("------------------------");
        System.out.println("Resultado da divisão: "+ divisao);
        System.out.println("Resultado resto da divisão " + resto);
        System.out.println("------------------------");

    }
}

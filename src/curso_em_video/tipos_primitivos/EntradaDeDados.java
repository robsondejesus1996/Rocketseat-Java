package curso_em_video.tipos_primitivos;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);

    }
}

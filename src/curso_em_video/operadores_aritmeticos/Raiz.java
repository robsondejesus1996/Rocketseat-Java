package curso_em_video.operadores_aritmeticos;

import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o número: ");
        int n1 = entrada.nextInt();


        float raiz = (float) Math.sqrt(n1);

        System.out.println(raiz);



    }
}

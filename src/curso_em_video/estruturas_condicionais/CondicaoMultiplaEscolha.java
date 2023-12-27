package curso_em_video.estruturas_condicionais;

import java.util.Scanner;

public class CondicaoMultiplaEscolha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade de pernas: ");
        int pernas = entrada.nextInt();

        switch (pernas){
            case 1:
                System.out.println("Saci");
            break;

            case 2:
                System.out.println("Bípede");
            break;

            case 3:
                System.out.println("Tripe");
            break;

            case 4:
                System.out.println("Quadrúpede");
            break;

            case 6,8:
                System.out.println("Aranha");
            break;

            default:
                System.out.println("ET");
        }
    }
}

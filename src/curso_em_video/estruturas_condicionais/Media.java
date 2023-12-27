package curso_em_video.estruturas_condicionais;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a Nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a Nota: ");
        float n2 = teclado.nextFloat();

        float m = (n1+n2)/2;


        if(m > 9){
            System.out.println("Parabéns");
        }else{
            System.out.println("Sua media foi "+ m);
        }
    }
}

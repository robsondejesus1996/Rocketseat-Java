package curso_em_video.estruturas_condicionais;

import java.util.Scanner;

public class ProgramaParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = entrada.nextInt();

        if(valor %2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}

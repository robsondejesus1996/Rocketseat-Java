package Revisao.condicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        while(true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe M, P ou G");

            String sigla = entrada.nextLine();

            switch (sigla) {
                case "P":
                    System.out.println("Pequeno");
                    break;
                case "M":
                    System.out.println("Médio");
                    break;
                case "G":
                    System.out.println("Grande");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}

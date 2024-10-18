package condicionais;

import java.util.Scanner;

public class PlanoSwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Infome o plano e descubra as vantagens: ");
        String plano = entrada.nextLine();

        switch (plano){
            case "basic":
                System.out.println("100 minutos de ligação");
                break;
            case "midia":
                System.out.println("100 minutos de ligação + WhatsApp e Instragram grátis");
                break;
            case "turbo":
                System.out.println("100 minutos de ligação + WhatsApp e Instragram grátis + 5 GB Youtube");
                break;
            default:
                System.out.println("Plano não encontrado");

        }
    }
}

package Revisao.condicional;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
                break;
            case "T":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5Gb Youtube");
                break;
        }
    }
}

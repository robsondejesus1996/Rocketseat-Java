package condicionais;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
        }

        String mes = "junho";

        switch (mes){
            case "maio":
                System.out.println("Maio");
                break;
            case "janeiro":
                System.out.println("Janeiro");
                break;

            default:
                System.out.println("Mes não encontrado..");
        }
    }
}

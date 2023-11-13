package excecoes;

public class Excecoes {

    // Checked exxceptions (exececoes verificadas)

    // Unchecked exception (execoes não verificadas)

    public static void main(String[] args) {

        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }

    }

    public static void validarNumero() throws Exception {
        int numero = 10;

        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }

}

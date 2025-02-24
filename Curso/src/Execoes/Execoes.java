package Execoes;

public class Execoes {
    public static void main(String[] args) {

        try {

            Double valor = (double) (100 / 2);
            System.out.println(valor);

        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();

        }finally {
            System.out.println("Finally bloco");
        }


        checkEstado("PI");

    }

    static void checkEstado(String nomeEstado) throws  StateValidationException{
        if(!nomeEstado.equals("PI")){
            throw  new StateValidationException();
        }else{
            System.out.println("Bem-vindo ao(a): "+ nomeEstado.toUpperCase());
        }

    }
}

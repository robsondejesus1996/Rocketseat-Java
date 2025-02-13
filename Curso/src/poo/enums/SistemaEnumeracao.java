package poo.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {

        for(EstadoBrasileiro eb: EstadoBrasileiro.values()){
            System.out.println("Estados localizados");
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
            System.out.println(eb.name());
            System.out.println("--------------------");

        }


    }
}

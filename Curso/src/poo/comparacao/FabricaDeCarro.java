package poo.comparacao;

public class FabricaDeCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("branco", "fiat", "palio");
        Carro carro2 = new Carro("branco", "fiat", "uno");
        Carro carro3 = new Carro("branco", "fiat", "palio");
        Carro carro4 = new Carro("branco", "fiat", "palio");

        Carro carro6 = carro1;

        System.out.println(carro1 == carro6);

        System.out.println(carro1.equals(carro2));
    }
}

package poo;

public class Sistema {

    public static void main(String[] args) {
        Cliente robson = new Cliente("'robson'");
        System.out.println(robson.limiteCredito);
        robson.solicitarLimiteCredito(200.0);

        robson.comprar(50.0);
        System.out.println("Limite do(a) "+ robson.limiteCredito);


        Cliente isabela = new Cliente("Izabele");
        System.out.println(isabela.limiteCredito);
        isabela.solicitarLimiteCredito(80.0);
        isabela.comprar(22.0);
        System.out.println("Limite do(a) "+ isabela.limiteCredito);
    }
}

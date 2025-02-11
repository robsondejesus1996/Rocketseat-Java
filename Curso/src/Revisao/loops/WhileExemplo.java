package Revisao.loops;

import java.util.concurrent.ThreadLocalRandom;

public class WhileExemplo {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado");
            mesada = mesada - valorDoce;

        }

        System.out.println("Mesada: " + mesada);
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

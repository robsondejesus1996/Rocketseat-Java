package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Robson");
        nomes.add("Caio");
        nomes.add("Josué");

        // for (String nome : nomes) {
        // System.out.println("O nome é " + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome é -->" + nome));

        nomes.forEach(System.out::println);
    }
}

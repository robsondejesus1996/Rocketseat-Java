package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Robson", 10);
        notas.put("Caio", 10);
        notas.put("Elias", 8);

        Integer nota = notas.get("Elias");

        System.out.println(nota);

        System.out.println("------------------");
        System.out.println("Percorrendo com for");

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);

        }
    }

}

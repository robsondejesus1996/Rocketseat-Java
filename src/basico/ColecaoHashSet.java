package basico;

import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        numeros.remove(12);

        for (Integer elementos : numeros) {
            System.out.println(elementos);
        }

        System.out.println("Verificando o tamanho do HashSet");
        System.out.println(numeros.size());

        System.out.println("Verificando se um numeros esta dentro deset hasSet");
        System.out.println(numeros.contains(12));
    }
}

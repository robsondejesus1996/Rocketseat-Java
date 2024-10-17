package operadores;

public class Unarios {
    public static void main(String[] args) {
        int numero = +5;
        System.out.println(numero);
        System.out.println(- numero);

        numero = numero ++;
        System.out.println(numero);

        boolean verdadeira = true;

        boolean falso = !verdadeira;

        System.out.println(falso);
    }
}

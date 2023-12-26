package curso_em_video.operadores_aritmeticos;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);


        System.out.println("Operadores de atribuição");
        int x =4;
        x+=2;// x = x +2
        System.out.println(x);
    }
}

package curso_em_video.operadores_aritmeticos;

public class Aleatorio {
    public static void main(String[] args) {
        double ale = Math.random();
        int n =(int) (5 + ale * (10-5));
        System.out.println(n);
    }
}

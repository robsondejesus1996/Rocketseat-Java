package curso_em_video.metodos;

public class Metodos {

    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é "+ s);

    }

    static int soma2(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou");
        soma(5,2);

        int sm = soma2(5,2);
        System.out.println("A soma vale "+ sm);
    }
}

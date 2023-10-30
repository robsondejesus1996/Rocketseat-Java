package primeirasAulas;

public class OlaMundo {
    public static void main(String[] args) {
        // Numeros (int, double, float, long)
        // Textos (String, char)
        // Booleano (boolean = true or false)

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 5565465465456465433l;
        String dadoDoTipoString = "Robson de Jesus";
        boolean dadoDoTipoBoolean = false;

        // if - else
        if (dadoDoTipoInt == 10) {
            System.out.println("Entrou no if do 10");
        } else if (dadoDoTipoInt < 12) {
            System.out.println("Entrou no if do 12");
        } else {
            System.out.println("Entrou no else");
        }

        // wile (Enquanto algo for verdadeiro, faça alguma coisa)

        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++;
        }

        // For
        System.out.println("Iniciando o For");
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor de i: " + i);
        }
    }
}

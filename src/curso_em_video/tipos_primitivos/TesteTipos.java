package curso_em_video.tipos_primitivos;

public class TesteTipos {

    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);

        System.out.println(valor);

        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);

        String valorFloat = "32.5";
        float idadeFloat = Float.parseFloat(valorFloat);
        System.out.println(idadeFloat);


    }
}

package curso_em_video.tipos_primitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Robson";
        float nota = 8.5f;
        System.out.println("A nota é "+nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
}

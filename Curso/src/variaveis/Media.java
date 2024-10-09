package variaveis;

public class Media {

    public static void main(String[] args) {

        int mediaFinal = 7;

        if (mediaFinal < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }


        for(int x = 2; x < 5; x++){
            System.out.println(x);

            if(x == 4){
                System.out.println("Elemento 4");
            }
        }

    }
}

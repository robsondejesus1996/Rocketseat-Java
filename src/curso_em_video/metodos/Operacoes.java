package curso_em_video.metodos;

public class Operacoes {

    public static String contador(int i, int f){
        String s = "";
        for(int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
}

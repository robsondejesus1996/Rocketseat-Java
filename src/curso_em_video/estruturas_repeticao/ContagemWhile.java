package curso_em_video.estruturas_repeticao;

public class ContagemWhile {
    public static void main(String[] args) {
        int cc = 1;
        String contagem = "";
        while(cc < 10){
            contagem = contagem + cc + ", ";
            cc++;
        }
        System.out.println("Contagem: "+contagem);
    }
}

package Revisao.condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >=7){
            System.out.println("Aprovado");
        }else if(nota >=5 && nota < 7){
           fluxoIntermediario();
        }else {
            System.out.println("Reprovado");
        }
    }

    static void fluxoIntermediario() {
        //faria alguma coisa
        System.out.println("Fluxo ");
        System.out.println("Em recuperação estude mais");
    }

}

package curso_em_video.variaveis_compostas;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {

        int n[] = {3,5,8,2};

        System.out.println("Total de casas de n "+ n.length);

        for(int c=0; c<=n.length-1; c++){
            System.out.println(n[c] + " ");
        }


        String mes [] ={"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tol [] = {31,28,31,31,31,31,31,31,30,31,30,31};

        for(int c=0; c< mes.length; c++){
            System.out.println("O mes de "+ mes[c] + " tem "+ tol[c]+ " dias ao todo.");
        }


        double v[] = {3.5, 2.75, 7.5, 8,9};
        Arrays.sort(v);

        int vet[] = {3,7,6,1};



        for(double valor:v){
            System.out.println(valor+" ");
        }


         int et[] = {3,7,6,1,9,4,2};
         for(int v1:et){
             System.out.println(v);
        }
        System.out.println("");
         int p = Arrays.binarySearch(et, 1);
        System.out.println("Encontrei o valor na posição "+ p);


        int v4[] = new int[20];
        Arrays.fill(v, 0);

        for(int valor: v4){
            System.out.println(valor + " ");

        }

    }

}

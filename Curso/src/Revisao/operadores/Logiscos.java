package Revisao.operadores;

public class Logiscos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2= true;


        if(condicao1 && condicao2){
            System.out.println("Os dois valores precisam ser verdadeiros");
        }

        if(condicao1 || condicao2){
            System.out.println("Um dos valores precisa ser verdadeiro");
        }


        if(1==1 && 2< 3){
            System.out.println("Os valores precisam ser verdadeiros");
        }
    }
}

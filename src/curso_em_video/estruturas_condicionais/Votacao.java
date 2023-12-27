package curso_em_video.estruturas_condicionais;

import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a data de nascimento: ");
        int idadeNas = entrada.nextInt();

        int idade = 2023 - idadeNas;

        System.out.println("Sua idade é " + idade);

        if(idade < 16){
            System.out.println("Não vota");
        }else {
            if((idade >=16 && idade < 18) || (idade >70)){
                System.out.println("Voto opcional");
            }else{
                System.out.println("Voto Obrigatório");
            }
        }

    }
}

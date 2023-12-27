package curso_em_video.estruturas_condicionais;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu: ");
        int dataNascimento = entrada.nextInt();
        int idade = 2023 - dataNascimento;
        System.out.println("Sua idade é "+ idade);

        if(idade > 18){
            System.out.println("Maior de idade");

        }else{
            System.out.println("Menor de idade");
        }
    }
}

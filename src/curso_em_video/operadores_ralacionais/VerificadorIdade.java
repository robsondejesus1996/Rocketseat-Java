package curso_em_video.operadores_ralacionais;

import java.util.Calendar;
import java.util.Scanner;


public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;


        String sit = ((idade>=16 && idade<18) || (idade>70))?"É OPCIONAL":"NÃO É OPCIONAL";


        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Idade: "+ idade);
        System.out.println("Situação: "+ sit);

    }
}

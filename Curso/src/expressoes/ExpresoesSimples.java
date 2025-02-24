package expressoes;

import java.time.LocalDate;

public class ExpresoesSimples {

    public static void main(String[] args) {
        String nome = "Robson de Jesus de Oliveira";
        String sobrenome = "de Jesus";
//        String textoImpresso = "Olá ".concat(nome).concat(" ").concat(sobrenome);

        Integer matricula = 123;
        Double salario = 2245.83;
        LocalDate dataAdmissao = LocalDate.now();


        String textoImpresso = String.format("Mat.: %05d - Nome: %-15s  Sal.: %,.2f data.: %td/%<tm/%<ty", matricula, nome, salario, dataAdmissao);

        System.out.println(textoImpresso);
    }
}

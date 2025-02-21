package nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {

    public static void main(String[] args) {

        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Robson de Jesus","M", 238948902435L, LocalDate.of(1996, 5, 8), 29.0, false));
        cadastros.add(new Cadastro("Maria de Jesus","M", 238948902435L, LocalDate.of(1996, 5, 8), 29.0, false));
        cadastros.add(new Cadastro("Carlos de Jesus","M", 238948902435L, LocalDate.of(1996, 5, 8), 29.0, false));

        escreverLayoutDelimitado(cadastros);

        escreverLayoutPosicional(cadastros);
    }

    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("****** - LAYOUT DELIMITADO - *******");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getNome() + ";");
                conteudo.append(cadastro.getSexo() + ";");
                conteudo.append(cadastro.getTelefone() + ";");
                conteudo.append(cadastro.getDataNascimento() + ";");
                conteudo.append(cadastro.getValorSugerido() + ";");
                conteudo.append(cadastro.isCliente());
                conteudo.append(System.lineSeparator());
            }
            System.out.println(conteudo.toString());
            Path arquivoDestino = Paths.get("c:\\robson\\lista-contatos-modelo-delimitado.csv");
            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("EM BREVE ....");

    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        System.out.println("****** - LAYOUT POSICIONADO - *******");

        System.out.println("EM BREVE ....");
    }
}

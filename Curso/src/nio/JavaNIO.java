package nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {

    public static void main(String[] args) {
        try{
            Path path = Paths.get("c:\\robson\\aula-java.txt");
            List<String> linhas = Files.readAllLines(path);
            linhas.forEach(l -> System.out.println(l));



            List<String> nomes = new ArrayList<>();
            nomes.add("Robson de Jesus");
            nomes.add("Engenheiro de Software");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(n -> conteudo.append(n + "\n"));
            Files.write(path,conteudo.toString().getBytes(StandardCharsets.UTF_8));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

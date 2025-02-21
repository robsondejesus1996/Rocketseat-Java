package nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File diretorio = new File("c://robson");
        System.out.println("Diretorio existe: "+diretorio.exists());

        if(!diretorio.exists()) {
            diretorio.mkdir();
            System.out.println("Diretorio criado com sucesso!");
        }

        try{
            File arquivo = new File(diretorio, "aula-java.txt");
            arquivo.createNewFile();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

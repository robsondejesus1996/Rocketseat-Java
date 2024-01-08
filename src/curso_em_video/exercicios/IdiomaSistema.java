package curso_em_video.exercicios;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Seu sistema esta em "+ idioma.getDisplayLanguage());
    }
}

package poo.pilares_opp;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        MSNMenssager msnMenssager = new MSNMenssager();
        FacebookMensager facebookMenssager = new FacebookMensager();
        Telegram telegram = new Telegram();

        SistemaMensagemInstantanea smi = null;


        String appEscolhido="fbm";

        if(appEscolhido.equals("msn")){
            smi = new MSNMenssager();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMensager();
        }else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.rebeverMensagem();


    }
}

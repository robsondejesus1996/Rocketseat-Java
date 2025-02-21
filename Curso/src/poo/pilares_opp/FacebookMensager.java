package poo.pilares_opp;

public class FacebookMensager extends SistemaMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviado mesgem pelo Facebook");
    }

    @Override
    public void rebeverMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Facebook");
    }
}

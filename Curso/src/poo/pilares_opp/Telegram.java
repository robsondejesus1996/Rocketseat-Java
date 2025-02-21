package poo.pilares_opp;

public class Telegram extends SistemaMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviado mesgem pelo Telegram");
    }

    @Override
    public void rebeverMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Telegram");
    }
}

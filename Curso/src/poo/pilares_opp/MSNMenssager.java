package poo.pilares_opp;

public class MSNMenssager extends SistemaMensagemInstantanea{


    @Override
    public void enviarMensagem() {
        System.out.println("Enviado mesgem pelo MSN");
    }

    @Override
    public void rebeverMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Mensagem");
    }
}

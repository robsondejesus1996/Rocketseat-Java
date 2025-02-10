package Revisao.condicional;

public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 16.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("Saldo atual: " + saldo);
        if(valorSolicitado == saldo){
            saldo = saldo - valorSolicitado;
        }
        }else {
            System.out.println("Saque não realizado");
        }
    }
}

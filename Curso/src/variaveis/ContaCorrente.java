package variaveis;

import java.util.Date;

public class ContaCorrente {

    int numeroConta;
    int numeroAgencia;
    String nomeCliente;
    Date dataNascimento;
    double saldo;

    public double Sacar(double valor){
        return valor;
    }

    public double Transferir(double contaDestino){
        return contaDestino;
    }

    public String CancelarConta(){
        return "Conta cancelada";
    }

    public double ConsultarSaldo(double saldo){
        return saldo;
    }

    public double ConsultarSaldoAtual(double saldoAtual){
        return saldoAtual;
    }

    public static void main(String[] args) {



    }
}

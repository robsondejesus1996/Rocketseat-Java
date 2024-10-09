package variaveis;

import java.time.LocalDate;
import java.util.List;

public class SolucaoContaCorrente {

    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    double saldo;
    boolean ativo = true;

    List extrado;

    Double conultarSaldo(){
        return saldo;
    }

    List consultarExtrado(LocalDate dataInicial, LocalDate dataFinal){
        return extrado;
    }

    void cancelar(String justificativa){

    }

    void transferir (SolucaoContaCorrente contaDestino, Double valorTransferido){

    }
    void sacar(double valorSolicitado){
        //não socitei logica
    }





}

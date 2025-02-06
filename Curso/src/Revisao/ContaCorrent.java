package Revisao;

import java.time.LocalDate;

public class ContaCorrent {

    private int numero_conta;
    private int numero_agencia;
    private String nome_cliente;
    private LocalDate data_nascimento;
    private Double saldo_conta;
    private boolean ativa = true;

    public double sacar(double valor){
        return valor - this.saldo_conta;
    }

    public double transferir(ContaCorrent contaDestino, Double valorTransferido){
        return valorTransferido;
    }

    public String cancelarConta(String justificativa) {
        ativa = false;
        return "Conta cancelada";
    }

    public double consultaExtrado(LocalDate dataInicial, LocalDate dataFinal){
        return saldo_conta;
    }

    public double contarSaldo(){
        return saldo_conta;
    }
}

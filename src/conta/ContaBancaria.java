package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    // construtor
    public ContaBancaria() {
        saldo = 0;
    }

    // Getters e Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    // Depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + ". Saldo atual R$" + saldo);
        } else {
            System.out.println("O valor de deposito é inválido");
        }
    }

    // Sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual R$" + saldo);
        }
    }
}

package conta;

import org.jetbrains.annotations.NotNull;

public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    // Variáveis.
    protected int agencia;
    protected int numero;
    protected double saldo;


    // Constructor
    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    // Métodos de saque, depósito e transferência.
    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, @NotNull Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    // Getters;
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}

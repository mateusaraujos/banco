package conta;

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

    public void transferir(double valor, Conta contaDestino) {
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

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %1$,.2f", this.saldo));
    }
}

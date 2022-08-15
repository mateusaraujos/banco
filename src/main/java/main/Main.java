package main;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

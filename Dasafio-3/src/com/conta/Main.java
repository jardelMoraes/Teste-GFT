package com.conta;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("1","jardel",100);
        ContaPoupanca contaPoupanca = new ContaPoupanca("1","jardel",100);

        System.out.println(contaCorrente + ", Rendimento Conta Corrente: " + contaCorrente.rendimento());
        System.out.println(contaPoupanca + ", Rendimento Conta Poupanca: " + contaPoupanca.rendimento());
    }
}

package com.conta;

public class ContaPoupanca extends Conta implements FuncionalidadeConta{
    public ContaPoupanca(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return (getSaldo()*0.07);
    }
}

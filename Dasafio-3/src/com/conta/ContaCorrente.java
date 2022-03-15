package com.conta;

public class ContaCorrente extends Conta implements FuncionalidadeConta{
    public ContaCorrente(String numero, String titular, double saldo) {
        super(numero, titular, saldo - 0.75);
    }

    @Override
    public double rendimento() {
        return (getSaldo()*0.05);
    }

}

package com.colaborador;

public class Vendedor extends Colaborador {

    public Vendedor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    double bonificacao() {
        return (getSalario() + 1000*getGrauInstrucao()*4);
    }
}

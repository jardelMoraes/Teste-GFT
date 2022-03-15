package com.colaborador;

public class Supervisor extends Colaborador {
    public Supervisor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    double bonificacao() {
        return (getSalario() + 1000*getGrauInstrucao()*3);
    }
}

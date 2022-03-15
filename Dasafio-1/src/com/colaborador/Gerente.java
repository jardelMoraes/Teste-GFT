package com.colaborador;

public class Gerente extends Colaborador{
    public Gerente(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    double bonificacao() {
        return (getSalario() + 1000 * getGrauInstrucao() * 2);
    }


}

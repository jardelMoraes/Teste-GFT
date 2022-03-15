package com.colaborador;

abstract class Colaborador {
    private String nome;
    private int idade;
    private double salario;
    private int grauInstrucao;

    public Colaborador(String nome, int idade, double salario, int grauInstrucao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(int grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", grauInstrucao=" + grauInstrucao +
                ", bonificacao=" + bonificacao() +
                '}';
    }

    double bonificacao() {

        return getSalario();
    }
}

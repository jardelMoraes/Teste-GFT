package com.colaborador;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Gerente",45,2500,5);
        Supervisor supervisor = new Supervisor("Supervisor",35,2000,4);
        Vendedor vendedor = new Vendedor("Vendedor",25,1900,3);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}

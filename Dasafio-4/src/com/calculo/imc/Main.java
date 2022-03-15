package com.calculo.imc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        double peso;
        double altura;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();

        System.out.print("Informe seu peso: ");
        peso = Double.parseDouble(scan.nextLine());
        System.out.print("Informe sua altura: ");
        altura = Double.parseDouble(scan.nextLine());

        double imc = peso / (altura * altura);


        // vamos mostrar a classificação
        if(imc < 18.5){
            System.out.println(nome + ", seu peso é: "+ peso + ", sua altura é: "+ altura + ", seu IMC é: " + imc + ", sua classificação é abaixo do peso");
        }
        else if((imc >= 18.5) && (imc < 24.9)){
            System.out.println(nome + ", seu peso é: "+ peso + ", sua altura é: "+ altura + ", seu IMC é: " + imc + ", sua classificação é peso normal");
        }
        else if((imc >= 25) && (imc < 29.9)){
            System.out.println(nome + ", seu peso é: "+ peso + ", sua altura é: "+ altura + ", seu IMC é: " + imc + ", sua classificação é sobrepeso");
        }
        else if((imc >= 30) && (imc < 34.9)){
            System.out.println(nome + ", seu peso é: "+ peso + ", sua altura é: "+ altura + ", seu IMC é: " + imc +", sua classificação é Obesidade Grau I");
        }
        else if((imc >= 35) && (imc < 40)){
            System.out.println(nome + ", seu peso é: "+ peso + ", sua altura é: "+ altura + ", seu IMC é: " + imc + ", sua classificação é Obesidade Grau II");
        }
        else{
            System.out.println(nome + ", seu peso é: "+ peso + ", sua altura é: "+ altura +  ", seu IMC é: " + imc + ", sua classificação é Obesidade Grau III ");
        }
        System.out.println("\n");
    }





    }


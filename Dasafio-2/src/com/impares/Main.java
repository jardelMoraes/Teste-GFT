package com.impares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        int contador = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o numero: ");
        numero = scan.nextInt();

        while (numero <= 99) {
            System.out.println("O numero precisa conter 3 digitos\n");
            System.out.println("digite o numero: ");
            numero = scan.nextInt();

        }

        if(numero >= 350 && numero <= 8750 ){
          while (numero > 0 ){
              int proximoDigito = numero % 10;
              numero = numero / 10;
              if (!(proximoDigito % 2 == 0)) {
                  contador++;
              }
          }
            System.out.println(contador);
        }


    }

}

package com.impares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = 0;
        int v = numero ;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o numero: ");
        numero = scan.nextInt();

        while (numero <= 99) {
            System.out.println("O numero precisa conter 3 digitos\n");
            System.out.println("digite o numero: ");
            numero = scan.nextInt();

        }

        if(numero >= 350 && numero <= 8750 ){
          while (v > 0 ){
              v = numero/10;
          }

        }

    }

}

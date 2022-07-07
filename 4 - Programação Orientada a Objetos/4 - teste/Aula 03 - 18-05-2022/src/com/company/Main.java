package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 2 && ehPrimo(valor)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }

    private static boolean ehPrimo(int valor) {
        boolean primo = true;
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                primo = false;
                break;


            }
        }
        return primo;



/*Locale.setDefault(Locale.US);

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
       System.out.println("Informe o nome do cachorro: ");
       String nome = scanner.next();
       System.out.println("Informe a quantidade de comida em Kg: ");
       int come = scanner.nextInt();

       if (come<3){
           System.out.println("Comida menor que 3Kg");
    }else {
           int totalPacotes=quantosPacotes(come);
           System.out.println(nome+" precisa de "+totalPacotes+" pacotes");
       }
}

private static int quantosPacotes(int kg){
    int quantidadePacotes=0;
    double somaPeso=0;

    while(somaPeso<Kg){
        quantidadePacotes++;
        System.out.println("Informe o peso do pacote: ");
        double peso = scanner.nextDouble();
        somaPeso = peso+somaPeso;
    }
    return quantidadePacotes;
    }*/

    }
}







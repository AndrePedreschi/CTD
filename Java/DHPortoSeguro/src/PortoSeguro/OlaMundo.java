package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade = 26;
		float altura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol� Mundo!!!");
		
		System.out.println("\n\t\tEntre com o seu nome: ");
		nome = leia.nextLine();
		
		
		//Teste de texto comentado 
		/*
		  Comentando
		  V�rias linhas 
		  de coment�rio
		  de uma �nica
		  vez!
		 */
		
		System.out.println("\n\t\tEntre com a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\nMeu nome � "+nome+", eu tenho "+idade+", anos e a minha altura � "+altura+" metros");
		
		System.out.printf("\nMeu nome � %s, eu tenho %d anos e a minha altura � %2.2f metros",nome,idade,altura);
		
		
		
		
	}

}

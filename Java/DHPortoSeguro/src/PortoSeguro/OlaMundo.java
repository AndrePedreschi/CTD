package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade = 26;
		float altura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá Mundo!!!");
		
		System.out.println("\n\t\tEntre com o seu nome: ");
		nome = leia.nextLine();
		
		
		//Teste de texto comentado 
		/*
		  Comentando
		  Várias linhas 
		  de comentário
		  de uma única
		  vez!
		 */
		
		System.out.println("\n\t\tEntre com a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\nMeu nome é "+nome+", eu tenho "+idade+", anos e a minha altura é "+altura+" metros");
		
		System.out.printf("\nMeu nome é %s, eu tenho %d anos e a minha altura é %2.2f metros",nome,idade,altura);
		
		
		
		
	}

}

package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome; //estou criando uma variável do tipo string
		int idade=29;
		float altura;
		float imc;
		float peso;
		Scanner leia = new Scanner(System.in); //estou crindo a entreada de dados
		
		System.out.println("Olá mundo!!!!");
		
		System.out.println("\n\t\tEntre com o seu nome:");
		nome = leia.nextLine();
		System.out.println("\n\t\tEntre com a sua altura: ");
		altura = leia.nextFloat();
		System.out.println("\nDigite o seu peso");
		
		peso=leia.nextFloat();
		
		imc=peso/(altura*altura);
		
		
		System.out.println(nome+" você tem "+idade+" anos e "+altura+"m de altura, o seu IMC é:"+imc);
		
		
		
		
		
		
		
		

	}

}

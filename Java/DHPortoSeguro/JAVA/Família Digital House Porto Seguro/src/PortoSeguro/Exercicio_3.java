package PortoSeguro;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1;
		float num2;
		float num3;
		float num4;
		float quadrado;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número");
		num1=leia.nextFloat();
		System.out.println("\nEntre com o segundo número");
		num2=leia.nextFloat();
		System.out.println("\nEntre com o terceiro número");
		num3=leia.nextFloat();
		System.out.println("\nEntre com o quarto número");
		num4=leia.nextFloat();
		
		
		if((num3*num3)>1000) {
			System.out.println("\nO quad do terceiro número é "+(num3*num3));
		}
		else {
			System.out.println("\nO primeiro número é "+num1+" e o seu quad é "+(num1*num1));
			System.out.println("\nO segundo número é "+num2+" e o seu quad é "+(num2*num2));
			System.out.println("\nO terceiro número é "+num3+" e o seu quad é "+(num3*num3));
			System.out.println("\nO quarto número é "+num4+" e o seu quad é "+(num4*num4));
		}
		
		
		
		
		
		
		
		
	}

}

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
		
		System.out.println("\nEntre com o primeiro n�mero");
		num1=leia.nextFloat();
		System.out.println("\nEntre com o segundo n�mero");
		num2=leia.nextFloat();
		System.out.println("\nEntre com o terceiro n�mero");
		num3=leia.nextFloat();
		System.out.println("\nEntre com o quarto n�mero");
		num4=leia.nextFloat();
		
		
		if((num3*num3)>1000) {
			System.out.println("\nO quad do terceiro n�mero � "+(num3*num3));
		}
		else {
			System.out.println("\nO primeiro n�mero � "+num1+" e o seu quad � "+(num1*num1));
			System.out.println("\nO segundo n�mero � "+num2+" e o seu quad � "+(num2*num2));
			System.out.println("\nO terceiro n�mero � "+num3+" e o seu quad � "+(num3*num3));
			System.out.println("\nO quarto n�mero � "+num4+" e o seu quad � "+(num4*num4));
		}
		
		
		
		
		
		
		
		
	}

}

package PortoSeguro;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float peso;
		float excesso;
		float multa;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\nEntre com o peso dos tomates:");
		peso = leia.nextFloat();
		
		if (peso>50) {
			excesso=peso-50;
			multa=excesso*4;
			System.out.println("\nO saco de tomate utrapassou em "+excesso+"Kg o máximo de 50kg e você tera de pagar uma multa de R$"+multa+" reais");
		}
		else {
			System.out.println("\nEstá tudo ok com a quantidade de tomates que trouce, você não tem multa a pagar.");
		}
		
		
		
		
		
		
		
	}

}

package PortoSeguro;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario = 0;
		float salarioExtra = 0;
		float horas = 0;
		float extra = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n Entre com a quantidade de horas trabalhadas: ");
		horas = leia.nextFloat();

		if (horas > 50) {

			extra = horas - 50;
			salarioExtra = extra * 20;
			salario = ((horas - extra) * 10) + salarioExtra;

			System.out.println(
					"\nVoc� fez " + extra + "h extras, e vai receber um sal�rio de R$" + salario + " esse m�s");

		} else {
			salario = horas * 10;
			System.out.println(
					"\nVoc� fez " + extra + "h extras, e vai receber um sal�rio de R$" + salario + " esse m�s");
		}

	}

}

//2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
//horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
//por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
//excedente.
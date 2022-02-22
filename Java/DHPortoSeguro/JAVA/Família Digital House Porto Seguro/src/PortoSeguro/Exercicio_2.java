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
					"\nVocê fez " + extra + "h extras, e vai receber um salário de R$" + salario + " esse mês");

		} else {
			salario = horas * 10;
			System.out.println(
					"\nVocê fez " + extra + "h extras, e vai receber um salário de R$" + salario + " esse mês");
		}

	}

}

//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
//excedente.
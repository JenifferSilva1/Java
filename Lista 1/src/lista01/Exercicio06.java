package lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float valor1, valor2, divisao;

		System.out.printf("Informe um valor: ");
		valor1 = sc.nextFloat();

		System.out.printf("Informe outro valor: ");
		valor2 = sc.nextFloat();

		divisao = valor1 / valor2;

		System.out.printf("O resultado da divisão é igual a: %.2f", divisao);
		sc.close();
	}

}

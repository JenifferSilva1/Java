package lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, subtracao;

		System.out.println("Informe um valor: ");
		valor1 = sc.nextInt();

		System.out.println("Informe outro valor: ");
		valor2 = sc.nextInt();

		subtracao = valor1 - valor2;

		System.out.println("O resultado da subtração é igual a: " + subtracao);
		sc.close();
	}

}

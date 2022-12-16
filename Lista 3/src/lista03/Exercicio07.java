package lista03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c;
		double soma, quadSoma;

		System.out.println("Informe o valor de A: ");
		a = sc.nextInt();

		System.out.println("Informe o valor de B: ");
		b = sc.nextInt();

		System.out.println("Informe o valor de C: ");
		c = sc.nextInt();

		soma = a + b + c;

		quadSoma = Math.pow(soma, 2);

		System.out.printf("O quadrado da soma dos três valores é igual a: %.2f", quadSoma);
		sc.close();

	}
}

package lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, multiplicacao;

		System.out.println("Informe um valor: ");
		valor1 = sc.nextInt();

		System.out.println("Informe outro valor: ");
		valor2 = sc.nextInt();

		multiplicacao = valor1 * valor2;

		System.out.println("O valor da multiplicação é igual a: " + multiplicacao);
		sc.close();

	}

}

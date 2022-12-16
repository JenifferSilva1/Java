package lista01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int base, altura, area;

		System.out.println("Informe a base do retângulo: ");
		base = sc.nextInt();

		System.out.println("Informe a altura do retângulo: ");
		altura = sc.nextInt();

		area = base * altura;

		System.out.println("A área do retângulo é igual a: " + area);
		sc.close();
	}

}

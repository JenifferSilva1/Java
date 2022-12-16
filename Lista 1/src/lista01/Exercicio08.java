package lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float base, altura, area;

		System.out.printf("Informe a base do triângulo: ");
		base = sc.nextFloat();

		System.out.printf("Informe a altura do triângulo: ");
		altura = sc.nextFloat();

		area = (base * altura) / 2;

		System.out.printf("A área do triângulo é igual a: " + area);
		sc.close();
	}

}

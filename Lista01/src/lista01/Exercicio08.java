package lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float base, altura, area;

		System.out.printf("Informe a base do tri�ngulo: ");
		base = sc.nextFloat();

		System.out.printf("Informe a altura do tri�ngulo: ");
		altura = sc.nextFloat();

		area = (base * altura) / 2;

		System.out.printf("A �rea do tri�ngulo � igual a: " + area);
		sc.close();
	}

}

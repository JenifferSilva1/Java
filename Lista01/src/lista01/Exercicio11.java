package lista01;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float bMaior, bMenor, altura, area;

		System.out.printf("Informe a base maior do trapézio: ");
		bMaior = sc.nextFloat();

		System.out.printf("Informe a base menor do trapézio: ");
		bMenor = sc.nextFloat();

		System.out.printf("Informe a altura do trapézio: ");
		altura = sc.nextFloat();

		area = (bMaior + bMenor) * altura / 2;

		System.out.printf("A área do trapézio é igual a: %.2f", area);
		sc.close();

	}

}

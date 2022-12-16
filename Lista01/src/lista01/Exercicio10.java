package lista01;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float diagMaior, diagMenor, area;

		System.out.printf("Informe a diagonal maior do losango: ");
		diagMaior = sc.nextFloat();

		System.out.printf("Informe a diagonal menor do losango: ");
		diagMenor = sc.nextFloat();

		area = (diagMaior * diagMenor) / 2;

		System.out.printf("A área do losango é igual a: %.2f", area);
		sc.close();

	}

}

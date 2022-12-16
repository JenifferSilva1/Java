package lista01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double lado, area;

		System.out.printf("Informe o valor do lado do quadrado: ");
		lado = sc.nextDouble();

		area = Math.pow(lado, 2);

		System.out.printf("A área do quadrado é igual a: %.2f" , area);
		sc.close();
	}

}

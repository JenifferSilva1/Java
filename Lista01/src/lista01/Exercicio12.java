package lista01;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float raio;
		double area;

		System.out.printf("Informe o raio do círculo: ");
		raio = sc.nextFloat();

		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo é igual a: %.2f", area);
		sc.close();
	}

}

package lista01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor, antecessor;
		System.out.println("Informe um valor: ");

		valor = sc.nextInt();

		antecessor = valor - 1;

		System.out.println("O número antecessor desse valor é igual a: " + antecessor);
		sc.close();
		
	}

}

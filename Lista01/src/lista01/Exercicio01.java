package lista01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor, sucessor;
		System.out.println("Informe um número: ");

		valor = sc.nextInt();

		sucessor = valor + 1;

		System.out.println("O sucessor desse número é: " + sucessor);
		
		sc.close();
	}

}


package lista01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, soma;
		
		System.out.println("Informe um valor: ");
		valor1 = sc.nextInt();

		System.out.println("Informe um valor: ");
		valor2 = sc.nextInt();

		soma = valor1+valor2;
		
		System.out.println("A soma dos valores é igual a: "+soma);
		sc.close();
	}

}

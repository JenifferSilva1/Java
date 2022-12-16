package lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int qtdReais;
		float cotacaoDolar, conversaoDolar;

		System.out.println("Informe a cotação do dólar: ");
		cotacaoDolar = sc.nextFloat();

		System.out.println("Informe a quantidade de reais que você tem: ");
		qtdReais = sc.nextInt();

		conversaoDolar = qtdReais / cotacaoDolar;

		System.out.printf("Essa quantidade de reais convertidos em dólar é igual a: %.2f", conversaoDolar);

		sc.close();
	}

}

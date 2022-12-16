package lista02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float valorPrestacao, taxa, novaPrestacao;
		int tempo;
		
		System.out.println("Informe o valor da prestação: ");
		valorPrestacao = sc.nextFloat();
		
		
		System.out.println("Informe o tempo que a fatura está atrasada em dias: ");
		tempo = sc.nextInt();
		
		System.out.println("Informe a taxa de atraso (ex: 5(%): ");
		taxa = sc.nextFloat();
		
		novaPrestacao = (valorPrestacao + (valorPrestacao * taxa / 100) * tempo);
		
		System.out.printf("O novo valor da prestação é igual a: %.2f", novaPrestacao);
		sc.close();
	}

}

package exemplos;

import java.util.Scanner;

public class Exemplo04 {
	
//	desvio condicional simples = IF

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		float valor1 = sc.nextFloat();

		System.out.println("Informe outro número: ");
		float valor2 = sc.nextFloat();
		float soma = valor1+valor2;

		System.out.printf("O valor da soma é igual a: %.2f",soma);
		
		if (soma > 10) {
			
			System.out.println("Número maior que 10");
			
		}
		sc.close();
		
	}

}

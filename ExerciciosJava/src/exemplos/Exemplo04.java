package exemplos;

import java.util.Scanner;

public class Exemplo04 {
	
//	desvio condicional simples = IF

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		float valor1 = sc.nextFloat();

		System.out.println("Informe outro n�mero: ");
		float valor2 = sc.nextFloat();
		float soma = valor1+valor2;

		System.out.printf("O valor da soma � igual a: %.2f",soma);
		
		if (soma > 10) {
			
			System.out.println("N�mero maior que 10");
			
		}
		sc.close();
		
	}

}

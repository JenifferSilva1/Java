package exemplos;

import java.util.Scanner;

public class Exemplo06 {

//	desvio condicional encadeado = ELSE IF

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua idade: ");

		int idade = sc.nextInt();

		if (idade < 16) {
			System.out.println("N�o pode votar");

		} else if (idade < 18 || idade > 65) {
			System.out.println("Voto opcional");

		} else {
			System.out.println("Voto obrigat�rio");
		}

		sc.close();
	}
}

package exemplos;

import java.util.Scanner;

public class Exemplo07 {
	
	//escolhacaso

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero para saber o dia da semana referente a ele: ");
		int numero = sc.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;

		default:
			System.out.println("N�o possui dia correspondente");
			break;
		}
	}

}

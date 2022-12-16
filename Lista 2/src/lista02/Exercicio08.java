package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tempo;
		float velocidadeMedia, distancia, litrosUsados;

		System.out.println("Informe o tempo gasto na viagem: ");
		tempo = sc.nextInt();

		System.out.println("Informe a velocidade média durante a viagem: ");
		velocidadeMedia = sc.nextFloat();

		distancia = tempo * velocidadeMedia;

		litrosUsados = distancia / 12;

		System.out.printf("\nA velocidade média da viagem foi igual a: %.2f", velocidadeMedia);
		System.out.println(" Km/h");
		System.out.println("\nO tempo gasto na viagem foi igual a: " + tempo + " horas");
		System.out.printf("\nA distância percorrida foi igual a: %.2f", distancia);
		System.out.println(" Km");
		System.out.printf("\nA quantidade de litros de gasolina usados foi igual a: %.2f", litrosUsados);
		System.out.println(" litros");
		
		sc.close();
	}

}

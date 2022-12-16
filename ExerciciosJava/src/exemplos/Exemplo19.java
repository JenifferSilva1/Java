package exemplos;

import java.util.Scanner;

public class Exemplo18 {
	
	//a ordem de escrita dos métodos não influencia no programa
	// exemplo usando mais parâmetros
	//nao rolou

	public static void main(String[] args) {
		
		mymethod(firstname, 5);
		mymethod("Anja", 8);
		mymethod("Jenny", 4);
	}

	static void mymethod(String firstname, int age) {
		System.out.println(firstname + " is " + age);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		string firstname = sc.toString();
		
		System.out.println("Informe sua idade:");
		age

	}
}

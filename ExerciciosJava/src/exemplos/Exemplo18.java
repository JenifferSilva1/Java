package exemplos;

public class Exemplo18 {
	
	//a ordem de escrita dos m�todos n�o influencia no programa
	// exemplo usando mais par�metros

	public static void main(String[] args) {
		mymethod("Liam", 5);
		mymethod("Anja", 8);
		mymethod("Jenny", 4);
	}

	static void mymethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
}

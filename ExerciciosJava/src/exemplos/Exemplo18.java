package exemplos;

public class Exemplo18 {
	
	//a ordem de escrita dos métodos não influencia no programa
	// exemplo usando mais parâmetros

	public static void main(String[] args) {
		mymethod("Liam", 5);
		mymethod("Anja", 8);
		mymethod("Jenny", 4);
	}

	static void mymethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
}

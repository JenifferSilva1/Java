package exemplos;

public class Exemplo10 {

	// vari�vel Narrow
	// transforma flutuante em inteiro

	public static void main(String[] args) {
		float numero = 130.01f;
		int numero1 = (int)numero;

		// mostra n�mero flutuante
		System.out.println(numero);
		// converte o 130 pra n�mero inteiro - sem casa decimal
		System.out.println(numero1);
	}

}

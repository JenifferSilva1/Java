package exemplos;

public class Exemplo09 {

	// vari�vel widening
	// quando pegamos de um n�mero menor para um n�mero maior, fazemos essa convers�o que � direta
	// consigo transformar um inteiro em flutuante, mas n�o o contr�rio, s� se for em Narrow (exemplo10)

	public static void main(String[] args) {
		int numero = 130;
		float numero1 = numero;

		// mostra n�mero inteiro
		System.out.println(numero);
		// converte o 130 pra n�mero flutuante - com casa decimal
		System.out.println(numero1);
	}

}

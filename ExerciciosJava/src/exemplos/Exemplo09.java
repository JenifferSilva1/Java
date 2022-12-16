package exemplos;

public class Exemplo09 {

	// variável widening
	// quando pegamos de um número menor para um número maior, fazemos essa conversão que é direta
	// consigo transformar um inteiro em flutuante, mas não o contrário, só se for em Narrow (exemplo10)

	public static void main(String[] args) {
		int numero = 130;
		float numero1 = numero;

		// mostra número inteiro
		System.out.println(numero);
		// converte o 130 pra número flutuante - com casa decimal
		System.out.println(numero1);
	}

}

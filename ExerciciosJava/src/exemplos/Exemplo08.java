package exemplos;

public class Exemplo08 {

	// exemplo vari�vel - 3 tipos

	public static void main(String[] args) {

		// inst�ncia da vari�vel = vari�vel tradicional
		int numero = 50;
		System.out.println(numero);

		// puxando a var est�tica l� de baixo:
		System.out.println(algarismo);

	}
	
	// vari�vel local = s� funciona dentro do m�todo em que foi criada
	// nesse m�todo n�o coloco main porque?
	
	public static void soma() {
		int valor = 10;
		int valor1 = 20;
		int soma = valor + valor1;
		System.out.println(soma);
	}

	// vari�vel est�tica = global, criada fora dos m�todos e pode ser chamada em
	// qualquer um deles, at� mesmo o main
	static int algarismo = 200;
}

package exemplos;

public class Exemplo08 {

	// exemplo variável - 3 tipos

	public static void main(String[] args) {

		// instância da variável = variável tradicional
		int numero = 50;
		System.out.println(numero);

		// puxando a var estática lá de baixo:
		System.out.println(algarismo);

	}
	
	// variável local = só funciona dentro do método em que foi criada
	// nesse método não coloco main porque?
	
	public static void soma() {
		int valor = 10;
		int valor1 = 20;
		int soma = valor + valor1;
		System.out.println(soma);
	}

	// variável estática = global, criada fora dos métodos e pode ser chamada em
	// qualquer um deles, até mesmo o main
	static int algarismo = 200;
}

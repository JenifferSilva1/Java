package lista02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int totalEleitores;
        float votosBrancos,  votosNulos, votosValidos, percVotosBrancos, percVotosNulos, percVotosValidos;

        System.out.println("Informe o total de eleitores do município: ");
        totalEleitores = sc.nextInt();

        System.out.printf("Informe o total de votos brancos: ");
        votosBrancos = sc.nextFloat();

        System.out.printf("Informe o total de votos nulos: ");
        votosNulos = sc.nextFloat();

        System.out.printf("Informe o total de votos válidos: ");
        votosValidos = sc.nextFloat();

        percVotosBrancos = votosBrancos / totalEleitores * 100;
        percVotosNulos = votosNulos / totalEleitores * 100;
        percVotosValidos = votosValidos / totalEleitores * 100;

        System.out.println("\nO número total de eleitores é igual a: " + totalEleitores);

        System.out.printf("\nO percentual de votos brancos em relação ao número total de eleitores é igual a: %.1f", percVotosBrancos);
        System.out.println("%");

        System.out.printf("\nO percentual de votos brancos em relação ao número total de eleitores é igual a: %.1f", percVotosNulos);
        System.out.println("%");

        System.out.printf("\nO percentual de votos brancos em relação ao número total de eleitores é igual a: %.1f", percVotosValidos);
        System.out.println("%");

        sc.close();
    }
}
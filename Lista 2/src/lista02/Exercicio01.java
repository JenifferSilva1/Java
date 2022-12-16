package lista02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int ano, mes, dia, total;

        System.out.println("Informe a sua idade: ");
        ano = sc.nextInt();

        System.out.println("Informe quantos meses se passaram desde o seu aniversário: ");
        mes = sc.nextInt();

        System.out.println("Informe quantos dias se passaram desde o seu último aniversário: ");
        dia = sc.nextInt();

        total = (ano*365)+(mes*30)+dia;

        System.out.println("O número de dias que você viveu é: "+total);

        sc.close();
    }

}
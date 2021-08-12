package modulo3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		while (numero <= 1000) {
			if (numero % 2 == 0) {
				numero+=5;
				System.out.println(numero);
			}
			else {
				numero*=2;
				System.out.println(numero);
			}
		}

	}

}

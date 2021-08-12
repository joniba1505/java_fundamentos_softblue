package modulo3;

import java.util.Scanner;

public class FatorialIterativo {

	public static void main(String[] args) {
		Scanner entradaFatorial = new Scanner(System.in);
		System.out.println("Digite o valor para o qual deseja calcular o fatorial:");
		int valor = entradaFatorial.nextInt();
		long fatorial = 1;
		for (int i=2; i<=valor; i++) {
			fatorial = fatorial*i;
		}
	System.out.println("O fatorial de " + valor + "é " + fatorial);
	
	}

}

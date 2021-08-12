package modulo3;

import java.util.Scanner;

public class FatorialRecursivo {

	public static void main(String[] args) {
		Scanner EntradaFatorial = new Scanner(System.in);
		System.out.println("Digite um valor para calcular o seu fatorial:");
		int valor = EntradaFatorial.nextInt();
		
		//Calcula o fatorial do valor
		int fatorial = calcularFatorial(valor);

		System.out.println("O fatorial de " + valor + "� " + fatorial);
	}

	/*
	 * Uma das formas de implementar o c�lculo do fatorial � utilizar uma chamada recursiva, isto �,
	 * a fun��o chama ela mesma.
	 */
	static int calcularFatorial(int num) {
		if (num == 0) {
			//para num == 0, o fatorial � 1
			return 1;
		}
	
//caso contr�rio, o fatorial � o 		 n�mero multiplicado pelo fatorial do seu antecessor
	return num * calcularFatorial(num-1);
	}
}
